package osvaldo.airport.app

import android.app.Application
import osvaldo.airport.app.di.AppContainer
import osvaldo.airport.app.di.AppContainerImpl

class AirportApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl(this)
    }
}