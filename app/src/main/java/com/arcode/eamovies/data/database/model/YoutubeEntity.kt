package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(tableName = Constants.TABLE_NAME_YOUTUBE)
data class YoutubeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "size") val size: String,
    @ColumnInfo(name = "source") val source: String,
    @ColumnInfo(name = "type") val type: String,
)