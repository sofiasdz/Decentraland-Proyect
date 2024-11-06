// We define the empty imports so the auto-complete feature works as expected.
import { Quaternion } from '@dcl/sdk/math'
import { engine, GltfContainer, Transform } from '@dcl/sdk/ecs'

import { circularSystem, collectedTokensSystem as collectedTokensSystem, poapSystem } from './systems'


import { createLegoAirplaneToken, createLegoHelicopterToken } from './factory'
import { LegoAirplane } from './components'

export function main() {
  engine.addSystem(circularSystem)
  engine.addSystem(collectedTokensSystem)
  engine.addSystem(poapSystem)

  createLegoAirplaneToken({x: 4, y: 1.5, z: 29})
  createLegoAirplaneToken({x: 4, y: 2.75, z: 24})
  createLegoAirplaneToken({x: 4, y: 4, z: 19})

  createLegoHelicopterToken({x: 25, y: 6, z: 40.25})
  createLegoHelicopterToken({x: 29.75, y: 6, z: 40.25})
  createLegoHelicopterToken({x: 29.75, y: 6, z: 35.5})
  createLegoHelicopterToken({x: 25, y: 6, z: 35.5})

  // FLOOR
  // let legoFloor1 = engine.addEntity()
  // GltfContainer.create(legoFloor1, { 
  //   src: 'models/lego-floor.glb', 
  // })
  // Transform.create(legoFloor1, {
  //   position: {x: 8, y: 0, z: 8},
  // })

  // let legoFloor2 = engine.addEntity()
  // GltfContainer.create(legoFloor2, { 
  //   src: 'models/lego-floor.glb', 
  // })
  // Transform.create(legoFloor2, {
  //   position: {x: 24, y: 0, z: 8},
  // })

  // let legoFloor3 = engine.addEntity()
  // GltfContainer.create(legoFloor3, { 
  //   src: 'models/lego-floor.glb', 
  // })
  // Transform.create(legoFloor3, {
  //   position: {x: 24, y: 0, z: 24},
  // })

  // GRASS
  let legoGrass1 = engine.addEntity()
  GltfContainer.create(legoGrass1, { 
    src: 'models/lego-grass.glb', 
  })
  Transform.create(legoGrass1, {
    position: {x: 8, y: 0, z: 24},
  })

  let legoGrass2 = engine.addEntity()
  GltfContainer.create(legoGrass2, { 
    src: 'models/lego-grass.glb', 
  })
  Transform.create(legoGrass2, {
    position: {x: 24, y: 0, z: 40},
  })

  let legoGrass3 = engine.addEntity()
  GltfContainer.create(legoGrass3, { 
    src: 'models/lego-grass-store.glb', 
  })
  Transform.create(legoGrass3, {
    position: {x: 8, y: 0, z: 40},
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

  let legoFigure = engine.addEntity()
  GltfContainer.create(legoFigure, { 
    src: 'models/lego-figure.glb', 
  })
  Transform.create(legoFigure, {
    position: {x: 1, y: 1, z: 41},
    rotation: Quaternion.fromEulerDegrees(0, 90, 0)
  })

  let legoAirplaneObstacle = engine.addEntity()
  GltfContainer.create(legoAirplaneObstacle, { 
    src: 'models/lego-airplane-obstacle.glb', 
  })
  Transform.create(legoAirplaneObstacle, {
    position: {x: 4, y: 1, z: 25},
    rotation: Quaternion.fromEulerDegrees(0, 180, 0),
  })

  let legoHelicopterObstacle = engine.addEntity()
  GltfContainer.create(legoHelicopterObstacle, { 
    src: 'models/lego-helicopter-obstacle.glb', 
  })
  Transform.create(legoHelicopterObstacle, {
    position: {x: 25, y: 1, z: 43},
    rotation: Quaternion.fromEulerDegrees(0, 180, 0),
  })
}

