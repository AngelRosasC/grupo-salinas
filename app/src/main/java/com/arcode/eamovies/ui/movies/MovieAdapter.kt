package com.arcode.eamovies.ui.movies

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.arcode.eamovies.BuildConfig.IMAGE_URL
import com.arcode.eamovies.R
import com.arcode.eamovies.databinding.ListItemMovieBinding
import com.arcode.eamovies.domain.models.Movie
import com.arcode.eamovies.utils.extensions.basicDiffUtil
import com.arcode.eamovies.utils.extensions.loadUrl
import com.arcode.eamovies.utils.extensions.toReadableDate

class MovieAdapter(private val listener: MovieAdapterListener, private val context: Context) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    var movies: List<Movie> by basicDiffUtil(
        areItemsTheSame = { old, new -> old.movieId == new.movieId }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding =
            ListItemMovieBinding.inflate(LayoutInflater.from(context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) =
        holder.bind(context, movies, listener)

    override fun getItemCount(): Int = movies.size

    inner class MovieViewHolder(private val binding: ListItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(context: Context, movies: List<Movie>, listener: MovieAdapterListener) {
            val movie = movies[absoluteAdapterPosition]
            with(binding) {
                tvTitle.text = movie.title
                tvRate.text = movie.voteAverage.toString()
                tvDate.text = movie.releaseDate.toReadableDate()
                tvLikes.text = movie.voteCount.toString()
                ivPoster.loadUrl(movie.posterPath)
                cvPoster.setOnClickListener { listener.onMovieClicked(movie) }
                clRate.background =
                    if (movie.voteAverage >= 7)
                        ContextCompat.getDrawable(context, R.drawable.style_background_rate_ok)
                    else
                        ContextCompat.getDrawable(context, R.drawable.style_background_rate_danger)
            }

        }
    }

    interface MovieAdapterListener {
        fun onMovieClicked(movie: Movie)
    }
}