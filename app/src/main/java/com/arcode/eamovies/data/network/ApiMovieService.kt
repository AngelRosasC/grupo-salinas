package com.arcode.eamovies.data.network

import com.arcode.eamovies.BuildConfig.*
import com.arcode.eamovies.data.network.model.MovieDetailResponse
import com.arcode.eamovies.data.network.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiMovieService {

    @GET(POPULAR)
    suspend fun getPopularMovies(): MovieResponse

    @GET(NOW_PLAYING)
    suspend fun getNowPlayingMovies(): MovieResponse

    @GET(MOVIE_DETAILS)
    suspend fun getMovieDetails(
        @Path("movie_id") id: Int?,
        @Path("append_to_response") append_to_response: String = "trailers,reviews",
    ): MovieDetailResponse

}