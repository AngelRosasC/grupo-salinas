package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants.TABLE_NAME_BELONGS_TO_COLLECTION

@Entity(tableName = TABLE_NAME_BELONGS_TO_COLLECTION)
data class BelongsToCollectionsEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "belongId") val belongId: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "poster_path") val poster_path: String,
    @ColumnInfo(name = "backdrop_path") val backdrop_path: String,
)