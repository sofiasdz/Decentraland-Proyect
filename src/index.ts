// We define the empty imports so the auto-complete feature works as expected.
import { Quaternion } from '@dcl/sdk/math'
import { engine, GltfContainer, Transform } from '@dcl/sdk/ecs'

import { circularSystem, collectedTokensSystem, poapSystem } from './systems'


import { createLegoAirplaneToken, createLegoHelicopterToken } from './factory'

import { AudioSource } from "@dcl/sdk/ecs"

export function main() {
  engine.addSystem(circularSystem)
  engine.addSystem(collectedTokensSystem)
  engine.addSystem(poapSystem)

  createLegoAirplaneToken({x: 27, y: 6, z: 15.75})
  createLegoAirplaneToken({x: 25.25, y: 6, z: 19})
  createLegoAirplaneToken({x: 27, y: 6, z: 22.75})

  createLegoHelicopterToken({x: 25.5, y: 5.5, z: 43.5})
  createLegoHelicopterToken({x: 19.5, y: 5.5, z: 43.5})
  createLegoHelicopterToken({x: 13.5, y: 5.5, z: 43.5})

  let legoStarPilot = engine.addEntity()
GltfContainer.create(legoStarPilot, { 
     src: 'models/lego-star-pilot.glb', 
   })
   Transform.create(legoStarPilot, {
     position: {x: 3, y: 0, z: 2},
     scale: {x: 0.02, y: 0.02, z: 0.02},
     rotation: Quaternion.fromEulerDegrees(0, 135, 0)
   })

  let spawnBase = engine.addEntity()
  GltfContainer.create(spawnBase, { 
        src: 'models/spawn-base.glb', 
      })
      Transform.create(spawnBase, {
        position: {x: 3, y: 2, z: 2},
        scale: {x: 1, y: 1, z: 1},
        rotation: Quaternion.fromEulerDegrees(0, 135, 0)
      })

  let arrowSign = engine.addEntity()
  GltfContainer.create(arrowSign, { 
           src: 'models/arrow_sign.glb', 
         })
       Transform.create(arrowSign, {
           position: {x: 5, y: 0, z: 2},
           scale: {x: 0.5, y: 0.5, z: 0.5},
           rotation: Quaternion.fromEulerDegrees(0, -100, 0)
         })
    
  let legoLogo = engine.addEntity()
    GltfContainer.create(legoLogo, { 
              src: 'models/lego.glb', 
            })
            Transform.create(legoLogo, {
              position: {x: 6, y: 1, z: 6},
              scale: {x: 10, y: 10, z: 10},
              rotation: Quaternion.fromEulerDegrees(0,150 , 0)
            })
     let bigSign = engine.addEntity()
    GltfContainer.create(bigSign, { 
              src: 'models/super_sign.glb', 
            })
            Transform.create(bigSign, {
              position: {x: 11, y: 0, z: 6},
              scale: {x: 1, y: 1, z: 1},
              rotation: Quaternion.fromEulerDegrees(0,90 , 0)
            })


  const sourceEntity = engine.addEntity()

  AudioSource.create(sourceEntity, {
              audioClipUrl: 'sounds/retro-game-arcade-short-236130.mp3',
              loop: true,
              playing: true,
            })
   


  let stage = engine.addEntity()
  GltfContainer.create(stage, { 
    src: 'models/stage.glb', 
  })
  Transform.create(stage, {
    position: {x: 4, y: 0, z: 44.5},
    rotation: Quaternion.fromEulerDegrees(0, 180, 0)
  })
}

