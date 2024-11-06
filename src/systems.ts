import {
  AudioSource,
  engine,
  GltfContainer,
  Transform,
  InputAction,
  pointerEventsSystem,
  Tween,
  EasingFunction,
} from '@dcl/sdk/ecs'
import { Quaternion, Vector3 } from '@dcl/sdk/math'
import { LegoAirplane, LegoAirplaneToken, LegoHelicopter, LegoHelicopterToken, Spinner } from './components'
import {openExternalUrl} from "~system/RestrictedActions"

/**
 * All cubes rotating behavior
 */
export function poapSystem(){
  let POAP_dispenser = engine.addEntity()
    GltfContainer.create(POAP_dispenser, { 
      src: 'models/POAP_dispenser.glb',  
    })
    Transform.create(POAP_dispenser, {
      position: {x: 10, y: 0, z:5 },
    
    })
    pointerEventsSystem.onPointerDown(
      {
        entity: POAP_dispenser,
        opts: {
          button: InputAction.IA_POINTER,
          hoverText: 'Claim POAP',
        }
      },
      function () {openExternalUrl({url: "https://poap.xyz/mint/5kn3ha"})}
    )
  }
  
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

export function collectedTokensSystem() {
  if (Array.from(engine.getEntitiesWith(LegoAirplaneToken)).length === 0 && Array.from(engine.getEntitiesWith(LegoAirplane)).length === 0) {
    let plane = engine.addEntity()
    LegoAirplane.create(plane)
    GltfContainer.create(plane, {
      src: 'models/lego-airplane.glb',
    })
    Transform.create(plane, {
      position: {x: 12, y: 2.95, z: 9},
      rotation: {x: 0, y: 90, z: 0, w: 0},
    })
    Tween.create(plane, {
      mode: Tween.Mode.Scale({
        start: Vector3.Zero(),
        end: Vector3.One(),
      }),
      duration: 5000,
      easingFunction: EasingFunction.EF_EASEINBOUNCE,
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


if (Array.from(engine.getEntitiesWith(LegoHelicopterToken)).length === 0 && Array.from(engine.getEntitiesWith(LegoHelicopter)).length === 0) {
    let helicopter = engine.addEntity()
    LegoHelicopter.create(helicopter)
    GltfContainer.create(helicopter, {
      src: 'models/lego-helicopter.glb',
    })
    Transform.create(helicopter, {
      position: {x: 21.75, y: 2.95, z: 27},
    })
    Tween.create(helicopter, {
      mode: Tween.Mode.Scale({
        start: Vector3.Zero(),
        end: Vector3.One(),
      }),
      duration: 5000,
      easingFunction: EasingFunction.EF_EASEINBOUNCE,
    })

    const surpriseSound = engine.addEntity();
    Transform.create(surpriseSound)
    AudioSource.create(surpriseSound, { audioClipUrl: 'sounds/surprise.mp3' })
    Transform.getMutable(surpriseSound).position = Transform.get(engine.PlayerEntity).position
    AudioSource.playSound(surpriseSound, 'sounds/surprise.mp3')

    // let legoAirplanePortrait = engine.addEntity()
    // GltfContainer.create(legoAirplanePortrait, { 
    //   src: 'models/lego-airplane-portrait.glb',  
    // })
    // Transform.create(legoAirplanePortrait, {
    //   position: {x: 2.5, y: 1.75, z: 47.5},
    //   rotation: Quaternion.fromEulerDegrees(90, 180, 0)
    // })
    // pointerEventsSystem.onPointerDown(
    //   {
    //     entity: legoAirplanePortrait,
    //     opts: {
    //       button: InputAction.IA_POINTER,
    //       hoverText: 'Ver Producto',
    //     }
    //   },
    //   function () {openExternalUrl({url: "https://www.lego.com/en-us/product/propeller-plane-31099"})}
    // )
  }
  }