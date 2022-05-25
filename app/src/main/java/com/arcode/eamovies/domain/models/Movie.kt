package com.arcode.eamovies.domain.models

import android.os.Parcelable
import com.arcode.eamovies.data.database.model.MovieEntity
import com.arcode.eamovies.data.network.model.MovieModel
import kotlinx.parcelize.Parcelize

@Parcelize
class Movie(
    val movieId: Int,
    val title: String,
    val releaseDate: String,
    val voteCount: Int,
    val voteAverage: Double,
    val posterPath: String,
) : Parcelable

fun MovieModel.toDomain() = Movie(
    movieId = movieId,
    title = title,
    releaseDate = releaseDate,
    voteCount = voteCount,
    voteAverage = voteAverage,
    posterPath = posterPath
)

fun MovieEntity.toDomain() = Movie(
    movieId = movieId,
    title = title,
    releaseDate = releaseDate,
    voteCount = voteCount,
    voteAverage = voteAverage,
    posterPath = posterPath
)