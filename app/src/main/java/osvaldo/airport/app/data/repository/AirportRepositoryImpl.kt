package osvaldo.airport.app.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import osvaldo.airport.app.data.local.dao.AirportDao
import osvaldo.airport.app.domain.mappers.toAirport
import osvaldo.airport.app.domain.model.Airport
import osvaldo.airport.app.domain.repository.AirportRepository

class AirportRepositoryImpl(private val airportDao: AirportDao) : AirportRepository {
    override fun getAirport(search: String): Flow<List<Airport>>
        = airportDao.searchAirports(search).map { it.map { it.toAirport() } }
}