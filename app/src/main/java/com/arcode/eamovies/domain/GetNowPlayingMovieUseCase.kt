package com.arcode.eamovies.domain

import com.arcode.eamovies.data.repository.MovieRepository
import com.arcode.eamovies.domain.models.Movie
import javax.inject.Inject

class GetNowPlayingMovieUseCase @Inject constructor(private val moviesRepository: MovieRepository) {
    suspend operator fun invoke(connected: Boolean): List<Movie> {
        if (connected) {
            val movies = moviesRepository.getNowPlayingMoviesFromAPI()
            if (movies.isNotEmpty()) {
                moviesRepository.deleteAllNowPlayingMovies()
                moviesRepository.insertNowPlayingMovies(movies)
                return movies
            }
        }
        return moviesRepository.getNowPlayingMoviesFromDB()
    }
}