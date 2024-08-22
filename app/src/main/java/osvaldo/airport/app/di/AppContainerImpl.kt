package osvaldo.airport.app.di

import android.content.Context
import osvaldo.airport.app.data.local.AirportDatabase
import osvaldo.airport.app.data.repository.AirportRepositoryImpl
import osvaldo.airport.app.domain.repository.AirportRepository

class AppContainerImpl(private val context: Context) : AppContainer {
    override val airportRepository: AirportRepository by lazy {
        AirportRepositoryImpl(AirportDatabase.getDatabase(context).airportDao())
    }
}