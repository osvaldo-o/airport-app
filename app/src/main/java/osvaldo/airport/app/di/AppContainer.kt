package osvaldo.airport.app.di

import osvaldo.airport.app.domain.repository.AirportRepository

interface AppContainer {
    val airportRepository: AirportRepository
}