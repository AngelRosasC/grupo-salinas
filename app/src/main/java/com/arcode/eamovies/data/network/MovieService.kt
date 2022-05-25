package com.arcode.eamovies.data.network

import com.arcode.eamovies.data.network.model.MovieDetailResponse
import com.arcode.eamovies.data.network.model.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieService @Inject constructor(private val api: ApiMovieService) {

    /**
     * Get the list of movies most popular from the API
     */
    suspend fun getPopularMovies(): List<MovieModel> = withContext(Dispatchers.IO) {
        api.getPopularMovies().results
    }

    /**
     * Get the list of movies now playing from the API
     */
    suspend fun getNowPlayingMovies(): List<MovieModel> = withContext(Dispatchers.IO) {
        api.getNowPlayingMovies().results
    }

    /**
     * Get movie detail from the API
     */
    suspend fun getMovieDetails(id: Int): MovieDetailResponse = withContext(Dispatchers.IO) {
        api.getMovieDetails(id)
    }
}