package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(tableName = Constants.TABLE_NAME_LANGUAGE)
data class SpokenLanguageEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "english_name") val englishName: String,
    @ColumnInfo(name = "iso_639_1") val iso6391: String,
    @ColumnInfo(name = "name") val name: String,
)