package osvaldo.airport.app.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
import osvaldo.airport.app.data.local.entity.FavoriteEntity

@Dao
interface FavoriteDao {

    @Query("SELECT * FROM favorite")
    fun getFavorite(): Flow<List<FavoriteEntity>>

    @Upsert
    suspend fun upsertFavorite(favorite: FavoriteEntity)

}