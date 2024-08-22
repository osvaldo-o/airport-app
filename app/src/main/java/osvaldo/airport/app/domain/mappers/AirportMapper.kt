package osvaldo.airport.app.domain.mappers

import osvaldo.airport.app.data.local.entity.AirportEntity
import osvaldo.airport.app.domain.model.Airport

fun AirportEntity.toAirport(): Airport
    = Airport(this.id, this.iataCode, this.name, this.passengers)