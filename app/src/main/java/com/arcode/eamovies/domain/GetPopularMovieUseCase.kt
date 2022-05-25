package com.arcode.eamovies.domain

import com.arcode.eamovies.data.repository.MovieRepository
import com.arcode.eamovies.domain.models.Movie
import javax.inject.Inject

class GetPopularMovieUseCase @Inject constructor(private val moviesRepository: MovieRepository) {
    suspend operator fun invoke(connected: Boolean): List<Movie> {
        if (connected) {
            val movies = moviesRepository.getPopularMoviesFromAPI()
            if (movies.isNotEmpty()) {
                moviesRepository.deleteAllPopularMovies()
                moviesRepository.insertPopularMovies(movies)
                return movies
            }
        }
        return moviesRepository.getPopularMoviesFromDB()
    }
}