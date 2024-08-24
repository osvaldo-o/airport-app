package osvaldo.airport.app.domain.repository

import kotlinx.coroutines.flow.Flow
import osvaldo.airport.app.domain.model.Favorite

interface FavoriteRepository {

    suspend fun getFavorite(): Flow<List<Favorite>>

    suspend fun newFavorite(favorite: Favorite): Favorite?

    suspend fun deleteFavorite(favorite: Favorite): Favorite?

}