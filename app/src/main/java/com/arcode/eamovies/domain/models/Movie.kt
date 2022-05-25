package com.arcode.eamovies.domain.models

import com.arcode.eamovies.data.database.model.MovieEntity
import com.arcode.eamovies.data.network.model.MovieModel

class Movie(
    val movieId: Int,
    val title: String,
    val releaseDate: String,
    val voteCount: Int,
    val voteAverage: Double,
    val posterPath: String,
)

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