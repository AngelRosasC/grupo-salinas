package com.arcode.eamovies.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.arcode.eamovies.data.database.model.MovieDetailEntity
import com.arcode.eamovies.data.database.model.MovieEntity
import com.arcode.eamovies.utils.constants.Constants.TABLE_NAME_MOVIES

@Dao
interface DatabaseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movie: List<MovieEntity>)

    @Query("SELECT * FROM $TABLE_NAME_MOVIES WHERE isNowPlaying = 0")
    suspend fun getAllPopularMovies(): List<MovieEntity>

    @Query("SELECT * FROM $TABLE_NAME_MOVIES WHERE isNowPlaying = 1")
    suspend fun getAllNowPlayingMovies(): List<MovieEntity>

    @Query("SELECT * FROM $TABLE_NAME_MOVIES WHERE movie_id = :movieId")
    suspend fun getMovieById(movieId: Int): MovieEntity?

    @Query("DELETE FROM $TABLE_NAME_MOVIES WHERE isNowPlaying = 0")
    suspend fun deleteAllPopularMovies()

    @Query("DELETE FROM $TABLE_NAME_MOVIES WHERE isNowPlaying = 1")
    suspend fun deleteAllNowPlayingMovies()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovieDetail(movie: MovieDetailEntity)

}