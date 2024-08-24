package osvaldo.airport.app.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import osvaldo.airport.app.data.local.dao.FavoriteDao
import osvaldo.airport.app.domain.mappers.toFavorite
import osvaldo.airport.app.domain.mappers.toFavoriteEntity
import osvaldo.airport.app.domain.model.Favorite
import osvaldo.airport.app.domain.repository.FavoriteRepository

class FavoriteRepositoryImpl(private val favoriteDao: FavoriteDao) : FavoriteRepository {

    override suspend fun getFavorite(): Flow<List<Favorite>>
        = favoriteDao.getFavorite().map { it.map { it.toFavorite() } }

    override suspend fun newFavorite(favorite: Favorite): Favorite?
        = favoriteDao.upsertFavorite(favorite.toFavoriteEntity())?.toFavorite()

    override suspend fun deleteFavorite(favorite: Favorite): Favorite?
        = favoriteDao.deleteFavorite(favorite.toFavoriteEntity())?.toFavorite()

}