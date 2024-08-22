package osvaldo.airport.app.domain.repository

import kotlinx.coroutines.flow.Flow
import osvaldo.airport.app.domain.model.Airport

interface AirportRepository {

    fun getAirport(search: String): Flow<List<Airport>>

}