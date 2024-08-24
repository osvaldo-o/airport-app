package osvaldo.airport.app.di

import osvaldo.airport.app.domain.repository.AirportRepository
import osvaldo.airport.app.domain.repository.FavoriteRepository

interface AppContainer {
    val airportRepository: AirportRepository
    val favoriteRepository: FavoriteRepository
}