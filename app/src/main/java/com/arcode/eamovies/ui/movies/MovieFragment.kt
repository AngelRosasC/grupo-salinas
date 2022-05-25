package com.arcode.eamovies.ui.movies

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.arcode.eamovies.databinding.FragmentMoviesBinding
import com.arcode.eamovies.domain.models.Movie
import com.arcode.eamovies.ui.details.MovieDetailsActivity
import com.arcode.eamovies.ui.movies.MovieAdapter
import com.arcode.eamovies.ui.movies.MovieViewModel
import com.arcode.eamovies.utils.constants.Constants.EXTRA_MOVIE
import com.arcode.eamovies.utils.extensions.isConnectedToInternet
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment(private val isNowPlayingMovie: Boolean? = false) : Fragment(),
    MovieAdapter.MovieAdapterListener {

    private var _binding: FragmentMoviesBinding? = null

    private val binding get() = _binding!!

    private val movieViewModel: MovieViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvMovies.adapter = MovieAdapter(this, requireContext())
        binding.rvMovies.setHasFixedSize(true)
        binding.rvMovies.layoutManager = GridLayoutManager(context, 2)

        movieViewModel.isConnected.value = context?.isConnectedToInternet()
        if (isNowPlayingMovie == true) {
            getNowPlayingMovies()
        } else {
            getPopularMovies()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onMovieClicked(movie: Movie) {
        val intent = Intent(requireContext(), MovieDetailsActivity::class.java)
        intent.putExtra(EXTRA_MOVIE, movie)
        context?.startActivity(intent)
    }

    private fun getPopularMovies() {
        movieViewModel.getPopularMovies()
        movieViewModel.popularMovies.observe(viewLifecycleOwner) {
            binding.rvMovies.adapter?.let { adapter ->
                if (adapter is MovieAdapter) {
                    adapter.movies = it
                }
            }
        }
    }

    private fun getNowPlayingMovies() {
        movieViewModel.getNowPlayingMovies()
        movieViewModel.nowPlayingMovie.observe(viewLifecycleOwner) {
            binding.rvMovies.adapter?.let { adapter ->
                if (adapter is MovieAdapter) {
                    adapter.movies = it
                }
            }
        }
    }
}