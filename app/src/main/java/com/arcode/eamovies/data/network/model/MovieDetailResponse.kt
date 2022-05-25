package com.arcode.eamovies.data.network.model

import com.google.gson.annotations.SerializedName


data class MovieDetailResponse(
    @SerializedName("adult") val adult: Boolean,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("belongs_to_collection") val belongsToCollection: Any,
    @SerializedName("budget") val budget: Int,
    @SerializedName("genres") val genres: List<Genre>,
    @SerializedName("homepage") val homepage: String,
    @SerializedName("id") val id: Int,
    @SerializedName("imdb_id") val imdbId: String,
    @SerializedName("original_language") val originalLanguage: String,
    @SerializedName("original_title") val originalTitle: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("popularity") val popularity: Double,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("production_companies") val productionCompanies: List<ProductionCompany>,
    @SerializedName("production_countries") val productionCountries: List<ProductionCountry>,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("revenue") val revenue: Int,
    @SerializedName("reviews") val reviews: Reviews,
    @SerializedName("runtime") val runtime: Int,
    @SerializedName("spoken_languages") val spokenLanguages: List<SpokenLanguage>,
    @SerializedName("status") val status: String,
    @SerializedName("tagline") val tagline: String,
    @SerializedName("title") val title: String,
    @SerializedName("trailers") val trailers: Trailers,
    @SerializedName("video") val video: Boolean,
    @SerializedName("videos") val videos: Videos,
    @SerializedName("vote_average") val voteAverage: Double,
    @SerializedName("vote_count") val voteCount: Int,
)

data class Genre(
    @SerializedName("id") val genreId: Int,
    @SerializedName("name") val name: String,
)

data class ProductionCompany(
    @SerializedName("id") val companyId: Int,
    @SerializedName("logo_path") val logoPath: String,
    @SerializedName("name") val name: String,
    @SerializedName("origin_country") val originCountry: String,
)

data class ProductionCountry(
    @SerializedName("iso_3166_1") val iso31661: String,
    @SerializedName("name") val name: String,
)

data class Reviews(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<ResultReview>,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("total_results") val totalResults: Int,
)

data class SpokenLanguage(
    @SerializedName("english_name") val englishName: String,
    @SerializedName("iso_639_1") val iso6391: String,
    @SerializedName("name") val name: String,
)

data class Trailers(
    @SerializedName("quicktime") val quicktime: List<Any>,
    @SerializedName("youtube") val youtube: List<Youtube>,
)

data class Videos(
    @SerializedName("results") val results: List<ResultVideo>,
)

data class ResultReview(
    @SerializedName("author") val author: String,
    @SerializedName("author_details") val authorDetails: AuthorDetails,
    @SerializedName("content") val content: String,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("id") val resultId: String,
    @SerializedName("updated_at") val updatedAt: String,
    @SerializedName("url") val url: String,
)

data class AuthorDetails(
    @SerializedName("avatar_path") val avatarPath: Any,
    @SerializedName("name") val name: String,
    @SerializedName("rating") val rating: Double,
    @SerializedName("username") val username: String,
)

data class Youtube(
    @SerializedName("name") val name: String,
    @SerializedName("size") val size: String,
    @SerializedName("source") val source: String,
    @SerializedName("type") val type: String,
)

data class ResultVideo(
    @SerializedName("id") val resultId: String,
    @SerializedName("iso_3166_1") val iso31661: String,
    @SerializedName("iso_639_1") val iso6391: String,
    @SerializedName("key") val key: String,
    @SerializedName("name") val name: String,
    @SerializedName("official") val official: Boolean,
    @SerializedName("published_at") val publishedAt: String,
    @SerializedName("site") val site: String,
    @SerializedName("size") val size: Int,
    @SerializedName("type") val type: String,
)