package osvaldo.airport.app.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite")
data class FavoriteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "departure_code")
    val departureCode: String,
    @ColumnInfo(name = "destination_code")
    val destinationCode: String
)
