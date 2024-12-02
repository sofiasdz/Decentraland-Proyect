// We define the empty imports so the auto-complete feature works as expected.
import { Quaternion } from '@dcl/sdk/math'
import { engine, GltfContainer, Transform } from '@dcl/sdk/ecs'

import { circularSystem, collectedTokensSystem, poapSystem } from './systems'


import { createLegoAirplaneToken, createLegoHelicopterToken } from './factory'

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

  // let legoStarPilot = engine.addEntity()
  // GltfContainer.create(legoStarPilot, { 
  //   src: 'models/lego-star-pilot.glb', 
  // })
  // Transform.create(legoStarPilot, {
  //   position: {x: 13, y: 0, z: 2},
  //   scale: {x: 0.02, y: 0.02, z: 0.02},
  //   rotation: Quaternion.fromEulerDegrees(0, 135, 0)
  // })

  // let legoStarPilot2 = engine.addEntity()
  // GltfContainer.create(legoStarPilot2, { 
  //   src: 'models/lego-star-pilot.glb', 
  // })
  // Transform.create(legoStarPilot2, {
  //   position: {x: 30, y: 0, z: 26},
  //   scale: {x: 0.02, y: 0.02, z: 0.02},
  //   rotation: Quaternion.fromEulerDegrees(0, 135, 0)
  // })


  let stage = engine.addEntity()
  GltfContainer.create(stage, { 
    src: 'models/stage.glb', 
  })
  Transform.create(stage, {
    position: {x: 4, y: 0, z: 44.5},
    rotation: Quaternion.fromEulerDegrees(0, 180, 0)
  })
}

