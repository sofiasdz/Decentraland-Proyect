import {
  AudioSource,
  engine,
  Transform,
  GltfContainer
} from '@dcl/sdk/ecs'
import { LegoAirplaneToken, LegoHelicopterToken, Spinner } from './components'
import * as utils from '@dcl-sdk/utils'

// Lego airplane token factory
export function createLegoAirplaneToken(position: {x: number, y: number, z: number}) {
  let token = engine.addEntity()
  LegoAirplaneToken.create(token)
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
  )
}

// Lego helicopter token factory
export function createLegoHelicopterToken(position: {x: number, y: number, z: number}) {
  let token = engine.addEntity()
  LegoHelicopterToken.create(token)
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
  )
}