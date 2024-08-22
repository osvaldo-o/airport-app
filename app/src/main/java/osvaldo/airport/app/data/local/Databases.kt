package osvaldo.airport.app.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import osvaldo.airport.app.data.local.dao.AirportDao
import osvaldo.airport.app.data.local.dao.FavoriteDao
import osvaldo.airport.app.data.local.entity.AirportEntity
import osvaldo.airport.app.data.local.entity.FavoriteEntity

@Database(entities = [AirportEntity::class, FavoriteEntity::class], version = 1, exportSchema = false)
abstract class AirportDatabase : RoomDatabase() {

    abstract fun airportDao(): AirportDao

    abstract fun favoriteDao(): FavoriteDao

    companion object {
        @Volatile
        private var Instance: AirportDatabase? = null

        fun getDatabase(context: Context): AirportDatabase = Instance ?: synchronized(this) {
            Room.databaseBuilder(context, AirportDatabase::class.java, "airport_database")
                .createFromAsset("database/flight_search.db")
                .fallbackToDestructiveMigration()
                .build()
                .also { Instance = it }
        }
    }

}