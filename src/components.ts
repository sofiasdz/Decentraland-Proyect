import { Schemas, engine } from '@dcl/sdk/ecs'

// We use this component to track and group all spinning entities.
// engine.getEntitiesWith(Spinner)
export const Spinner = engine.defineComponent('spinner', { speed: Schemas.Number })

export const LegoAirplaneToken = engine.defineComponent('lego-airplane-token-id', {})

export const LegoAirplane = engine.defineComponent('lego-airplane-id', {})

export const LegoHelicopterToken = engine.defineComponent('lego-helicopter-token-id', {})

export const LegoHelicopter = engine.defineComponent('lego-helicopter-id', {})