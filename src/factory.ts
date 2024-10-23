import {
  AudioSource,
  Entity,
  engine,
  Transform,
  MeshRenderer,
  MeshCollider,
  PointerEvents,
  PointerEventType,
  InputAction,
  Material,
  GltfContainer
} from '@dcl/sdk/ecs'
import { Cube, LegoToken, Spinner } from './components'
import { Color4 } from '@dcl/sdk/math'
import { getRandomHexColor } from './utils'
import * as utils from '@dcl-sdk/utils'

// Cube factory
export function createCube(x: number, y: number, z: number, spawner = true): Entity {
  const entity = engine.addEntity()

  // Used to track the cubes
  Cube.create(entity)

  Transform.create(entity, { position: { x, y, z } })

  // set how the cube looks and collides
  MeshRenderer.setBox(entity)
  MeshCollider.setBox(entity)
  Material.setPbrMaterial(entity, { albedoColor: Color4.fromHexString(getRandomHexColor()) })

  // Make the cube spin, with the circularSystem
  Spinner.create(entity, { speed: 100 * Math.random() })

  // Create PointerEvent with the hover feedback.
  // We are going to check the onClick event on the changeColorSystem.
  PointerEvents.create(entity, {
    pointerEvents: [
      { eventType: PointerEventType.PET_DOWN, eventInfo: { button: InputAction.IA_POINTER, hoverText: 'Change Color' } }
    ]
  })

  return entity
}

// Lego token factory
export function createLegoToken(position: {x: number, y: number, z: number}) {
  let token = engine.addEntity()
  LegoToken.create(token)
  GltfContainer.create(token, {
    src: 'models/lego-token.glb'
  })
  Transform.create(token, {
    position: position,
    scale: {x: 0.25, y: 0.25, z: 0.25},
  })
  Spinner.create(token, { speed: 40 })

    /**
   * Sound is a separated from the coin entity so that you can
   * still hear it even when the coin is removed from the engine.
   */
  const tokenPickupSound = engine.addEntity()
  Transform.create(tokenPickupSound)
  AudioSource.create(tokenPickupSound, { audioClipUrl: 'sounds/tokenPickup.mp3' })

  utils.triggers.oneTimeTrigger(
    token,
    utils.LAYER_1,
    utils.LAYER_1,
    [{ type: 'box' }],
    () => {
      Transform.getMutable(tokenPickupSound).position = Transform.get(engine.PlayerEntity).position
      AudioSource.playSound(tokenPickupSound, 'sounds/tokenPickup.mp3')
      engine.removeEntity(token)
    },
    // Color3.Yellow()
  )
}