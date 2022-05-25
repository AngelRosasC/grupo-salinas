package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(
    tableName = Constants.TABLE_NAME_TRAILERS,
    foreignKeys = [
        (ForeignKey(entity = YoutubeEntity::class,
            parentColumns = ["id"],
            childColumns = ["id"],
            onDelete = ForeignKey.CASCADE))
    ]
)
data class TrailersEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "quicktime") val quicktime: List<Any>,
    @ColumnInfo(name = "youtube") val youtube: List<YoutubeEntity>,
)