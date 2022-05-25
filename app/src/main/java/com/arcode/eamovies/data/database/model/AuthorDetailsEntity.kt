package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(tableName = Constants.TABLE_NAME_AUTHOR)
data class AuthorDetailsEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "avatar_path") val avatarPath: Any,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "rating") val rating: Double,
    @ColumnInfo(name = "username") val username: String,
)