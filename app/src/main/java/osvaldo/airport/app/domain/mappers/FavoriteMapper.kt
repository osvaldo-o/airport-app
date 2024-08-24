package osvaldo.airport.app.domain.mappers

import osvaldo.airport.app.data.local.entity.FavoriteEntity
import osvaldo.airport.app.domain.model.Favorite

fun FavoriteEntity.toFavorite(): Favorite =
    Favorite(this.id, this.departureCode, this.destinationCode)

fun Favorite.toFavoriteEntity(): FavoriteEntity =
    FavoriteEntity(this.id, this.departureCode, this.destinationCode)