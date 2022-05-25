package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(tableName = Constants.TABLE_NAME_RESULT_VIDEO)
data class ResultVideoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "result_id") val resultId: String,
    @ColumnInfo(name = "iso_3166_1") val iso31661: String,
    @ColumnInfo(name = "iso_639_1") val iso6391: String,
    @ColumnInfo(name = "key") val key: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "official") val official: Boolean,
    @ColumnInfo(name = "published_at") val publishedAt: String,
    @ColumnInfo(name = "site") val site: String,
    @ColumnInfo(name = "size") val size: Int,
    @ColumnInfo(name = "type") val type: String,
)