package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.domain.models.Movie
import com.arcode.eamovies.utils.constants.Constants.TABLE_NAME_MOVIES

@Entity(tableName = TABLE_NAME_MOVIES)
data class MovieEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "movie_id") val movieId: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "releaseDate") val releaseDate: String,
    @ColumnInfo(name = "voteCount") val voteCount: Int,
    @ColumnInfo(name = "voteAverage") val voteAverage: Double,
    @ColumnInfo(name = "posterPath") val posterPath: String,
    @ColumnInfo(name = "isNowPlaying") val nowPlaying: Boolean? = false,
)

fun Movie.toDatabase(nowPlaying: Boolean? = false) = MovieEntity(
    movieId = movieId,
    title = title,
    releaseDate = releaseDate,
    voteCount = voteCount,
    voteAverage = voteAverage,
    posterPath = posterPath,
    nowPlaying = nowPlaying ?: false
)