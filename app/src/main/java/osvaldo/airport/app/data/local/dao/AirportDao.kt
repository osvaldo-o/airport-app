package osvaldo.airport.app.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import osvaldo.airport.app.data.local.entity.AirportEntity

@Dao
interface AirportDao {

    @Query("SELECT * FROM airport WHERE name LIKE :search||'%' OR iata_code LIKE :search||'%'")
    fun getAirports(search: String): Flow<List<AirportEntity>>

}