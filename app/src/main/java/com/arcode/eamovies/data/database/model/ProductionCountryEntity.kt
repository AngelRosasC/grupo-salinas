package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(tableName = Constants.TABLE_NAME_COUNTRY)
data class ProductionCountryEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "iso_3166_1") val iso31661: String,
    @ColumnInfo(name = "name") val name: String,
)