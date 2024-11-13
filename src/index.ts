// We define the empty imports so the auto-complete feature works as expected.
import { Quaternion } from '@dcl/sdk/math'
import { engine, GltfContainer, Transform } from '@dcl/sdk/ecs'

import { circularSystem, collectedTokensSystem, poapSystem } from './systems'


import { createLegoAirplaneToken, createLegoHelicopterToken } from './factory'

export function main() {
  engine.addSystem(circularSystem)
  engine.addSystem(collectedTokensSystem)
  engine.addSystem(poapSystem)

  // createLegoAirplaneToken({x: 4, y: 2, z: 28.75})
  // createLegoAirplaneToken({x: 4, y: 3.25, z: 23.75})
  createLegoAirplaneToken({x: 4, y: 4.25, z: 18.75})

  // createLegoHelicopterToken({x: 24, y: 5, z: 38})
  // createLegoHelicopterToken({x: 28.75, y: 5, z: 38})
  // createLegoHelicopterToken({x: 28.75, y: 5, z: 33.25})
  createLegoHelicopterToken({x: 24, y: 5, z: 33.25})

  let legoStarPilot = engine.addEntity()
  GltfContainer.create(legoStarPilot, { 
    src: 'models/lego-star-pilot.glb', 
  })
  Transform.create(legoStarPilot, {
    position: {x: 13, y: 0, z: 2},
    scale: {x: 0.02, y: 0.02, z: 0.02},
    rotation: Quaternion.fromEulerDegrees(0, 135, 0)
  })

  let legoStarPilot2 = engine.addEntity()
  GltfContainer.create(legoStarPilot2, { 
    src: 'models/lego-star-pilot.glb', 
  })
  Transform.create(legoStarPilot2, {
    position: {x: 30, y: 0, z: 26},
    scale: {x: 0.02, y: 0.02, z: 0.02},
    rotation: Quaternion.fromEulerDegrees(0, 135, 0)
  })

  //
  let legoStore = engine.addEntity()
  GltfContainer.create(legoStore, { 
    src: 'models/lego-store.glb', 
  })
  Transform.create(legoStore, {
    position: {x: 4, y: 0, z: 44.75},
    rotation: {x: 0, y: 90, z: 0, w: 0},
  })
}

