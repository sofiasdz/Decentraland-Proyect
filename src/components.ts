import { Schemas, engine } from '@dcl/sdk/ecs'

// We use this component to track and group all spinning entities.
// engine.getEntitiesWith(Spinner)
export const Spinner = engine.defineComponent('spinner', { speed: Schemas.Number })

export const LegoToken = engine.defineComponent('lego-token-id', {})

export const LegoAirplane = engine.defineComponent('lego-airplane-id', {})