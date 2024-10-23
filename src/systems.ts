import {
  AudioSource,
  engine,
  GltfContainer,
  Transform,
  InputAction,
  pointerEventsSystem,
} from '@dcl/sdk/ecs'
import { Quaternion } from '@dcl/sdk/math'
import { LegoAirplane, LegoToken } from './components'
import {openExternalUrl} from "~system/RestrictedActions"

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
      position: {x: 2.5, y: 1.75, z: 47.5},
      rotation: Quaternion.fromEulerDegrees(90, 180, 0)
    })
    pointerEventsSystem.onPointerDown(
      {
        entity: legoAirplanePortrait,
        opts: {
          button: InputAction.IA_POINTER,
          hoverText: 'Ver Producto',
        }
      },
      function () {openExternalUrl({url: "https://www.lego.com/en-us/product/propeller-plane-31099"})}
    )
  }
}