package com.arcode.eamovies.data.repository

import com.arcode.eamovies.data.database.dao.DatabaseDao
import com.arcode.eamovies.data.database.model.toDatabase
import com.arcode.eamovies.data.network.MovieService
import com.arcode.eamovies.domain.models.Movie
import com.arcode.eamovies.domain.models.toDomain
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val service: MovieService,
    private val dao: DatabaseDao,
) {

    /**
     * Get popular movies from the API
     */
    suspend fun getPopularMoviesFromAPI(): List<Movie> =
        service.getPopularMovies().map { it.toDomain() }

    /**
     * Get now playing movies from API
     */
    suspend fun getNowPlayingMoviesFromAPI(): List<Movie> =
        service.getNowPlayingMovies().map { it.toDomain() }

    /**
     * Insert popular movies into the database
     */
    suspend fun insertPopularMovies(movies: List<Movie>) =
        dao.insertMovies(movies.map { it.toDatabase() })

    /**
     * Insert now playing movies into the database
     */
    suspend fun insertNowPlayingMovies(movies: List<Movie>) =
        dao.insertMovies(movies.map { it.toDatabase(true) })

    /**
     * Get all popular movies from the database
     */
    suspend fun getPopularMoviesFromDB(): List<Movie> =
        dao.getAllPopularMovies().map { it.toDomain() }

    /**
     * Get all now playing movies from the database
     */
    suspend fun getNowPlayingMoviesFromDB(): List<Movie> =
        dao.getAllNowPlayingMovies().map { it.toDomain() }

    /**
     * Get movie by id from the database
     */
    suspend fun getMovieById(id: Int): Movie? = dao.getMovieById(id)?.toDomain()

    /**
     * Delete all popular movies from the database
     */
    suspend fun deleteAllPopularMovies() = dao.deleteAllPopularMovies()

    /**
     * Delete all now playing movies from the database
     */
    suspend fun deleteAllNowPlayingMovies() = dao.deleteAllNowPlayingMovies()

}