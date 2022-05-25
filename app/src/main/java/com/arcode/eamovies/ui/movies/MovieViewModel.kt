package com.arcode.eamovies.ui.movies

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arcode.eamovies.domain.GetNowPlayingMovieUseCase
import com.arcode.eamovies.domain.GetPopularMovieUseCase
import com.arcode.eamovies.domain.models.Movie
import com.arcode.eamovies.utils.extensions.isConnectedToInternet
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val getPopularMovieUseCase: GetPopularMovieUseCase,
    private val getNowPlayingMovieUseCase: GetNowPlayingMovieUseCase,

    ) : ViewModel() {

    val popularMovies = MutableLiveData<List<Movie>>()
    val nowPlayingMovie = MutableLiveData<List<Movie>>()
    val isConnected = MutableLiveData<Boolean>()

    val isLoading = MutableLiveData<Boolean>()

    fun getPopularMovies() = viewModelScope.launch {
        isLoading.value = true
        val movies = getPopularMovieUseCase(isConnected.value!!)
        if (movies.isNotEmpty()) {
            popularMovies.postValue(movies)
            isLoading.postValue(false)
        } else {
            isLoading.postValue(false)
        }
    }

    fun getNowPlayingMovies() = viewModelScope.launch {
        isLoading.value = true
        val movies = getNowPlayingMovieUseCase(isConnected.value!!)
        if (movies.isNotEmpty()) {
            nowPlayingMovie.postValue(movies)
            isLoading.postValue(false)
        } else {
            isLoading.postValue(false)
        }
    }

}