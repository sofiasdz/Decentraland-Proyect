import {
  AudioSource,
  engine,
  GltfContainer,
  Transform,
  inputSystem,
  PointerEvents,
  InputAction,
  PointerEventType,
  pointerEventsSystem,
  Material,
} from '@dcl/sdk/ecs'
import { Color4, Quaternion, Vector3 } from '@dcl/sdk/math'
import { Cube, Spinner, LegoAirplane, LegoToken } from './components'
import { getRandomHexColor } from './utils'
import {openExternalUrl} from "~system/RestrictedActions"

/**
 * All cubes rotating behavior
 */
export function circularSystem(dt: number) {
  const entitiesWithSpinner = engine.getEntitiesWith(Spinner, Transform)
  for (const [entity, _spinner, _transform] of entitiesWithSpinner) {
    const mutableTransform = Transform.getMutable(entity)
    const spinnerData = Spinner.get(entity)

    mutableTransform.rotation = Quaternion.multiply(
      mutableTransform.rotation,
      Quaternion.fromAngleAxis(dt * spinnerData.speed, Vector3.Up())
    )
  }
}

/**
 * Search for the cubes that has pointerEvents, and when there is a click change the color.
 */
export function changeColorSystem() {
  for (const [entity] of engine.getEntitiesWith(Cube, PointerEvents)) {
    if (inputSystem.isTriggered(InputAction.IA_POINTER, PointerEventType.PET_DOWN, entity)) {
      Material.setPbrMaterial(entity, { albedoColor: Color4.fromHexString(getRandomHexColor()) })
    }
  }
}

export function collectedTokensSystem() {
  if (Array.from(engine.getEntitiesWith(LegoToken)).length === 0 && Array.from(engine.getEntitiesWith(LegoAirplane)).length === 0) {
    let plane = engine.addEntity()
    LegoAirplane.create(plane)
    GltfContainer.create(plane, {
      src: 'models/lego-airplane.glb',
    })
    Transform.create(plane, {
      position: {x: 12, y: 2.95, z: 9},
      rotation: {x: 0, y: 90, z: 0, w: 0},
    })

    const surpriseSound = engine.addEntity();
    Transform.create(surpriseSound)
    AudioSource.create(surpriseSound, { audioClipUrl: 'sounds/surprise.mp3' })
    Transform.getMutable(surpriseSound).position = Transform.get(engine.PlayerEntity).position
    AudioSource.playSound(surpriseSound, 'sounds/surprise.mp3')

    let legoAirplanePortrait = engine.addEntity()
    GltfContainer.create(legoAirplanePortrait, { 
      src: 'models/lego-airplane-portrait.glb',  
    })
    Transform.create(legoAirplanePortrait, {
      position: {x: 5, y: 2, z: 47.5},
      rotation: Quaternion.fromEulerDegrees(90, 180, 0)
    })
    pointerEventsSystem.onPointerDown(
      {
        entity: legoAirplanePortrait,
        opts: {
          button: InputAction.IA_POINTER,
          hoverText: 'View Product',
        }
      },
      function () {openExternalUrl({url: "https://www.lego.com/en-us/product/propeller-plane-31099"})}
    )
  }
}