package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants.TABLE_NAME_DETAILS


@Entity(
    tableName = TABLE_NAME_DETAILS,
    foreignKeys = [
        (ForeignKey(
            entity = GenreEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        )),
        (ForeignKey(
            entity = ProductionCompanyEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        )),
        (ForeignKey(
            entity = ProductionCountryEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        )),
        (ForeignKey(
            entity = ReviewsEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        )),
        (ForeignKey(
            entity = SpokenLanguageEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        )),
        (ForeignKey(
            entity = AuthorDetailsEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        )),
        (ForeignKey(
            entity = TrailersEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        )),
        (ForeignKey(
            entity = VideosEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id"),
            onDelete = ForeignKey.CASCADE
        ))

    ]
)
data class MovieDetailEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "adult") val adult: Boolean,
    @ColumnInfo(name = "backdropPath") val backdropPath: String,
    @ColumnInfo(name = "belongsToCollection") val belongsToCollection: Any,
    @ColumnInfo(name = "budget") val budget: Int,
    @ColumnInfo(name = "genres") val genres: List<GenreEntity>,
    @ColumnInfo(name = "homepage") val homepage: String,
    @ColumnInfo(name = "movieId") val movieId: Int,
    @ColumnInfo(name = "imdbId") val imdbId: String,
    @ColumnInfo(name = "originalLanguage") val originalLanguage: String,
    @ColumnInfo(name = "originalTitle") val originalTitle: String,
    @ColumnInfo(name = "overview") val overview: String,
    @ColumnInfo(name = "popularity") val popularity: Double,
    @ColumnInfo(name = "posterPath") val posterPath: String,
    @ColumnInfo(name = "productionCompanies") val productionCompanies: List<ProductionCompanyEntity>,
    @ColumnInfo(name = "productionCountries") val productionCountries: List<ProductionCountryEntity>,
    @ColumnInfo(name = "releaseDate") val releaseDate: String,
    @ColumnInfo(name = "revenue") val revenue: Int,
    @ColumnInfo(name = "reviews") val reviews: ReviewsEntity,
    @ColumnInfo(name = "runtime") val runtime: Int,
    @ColumnInfo(name = "spokenLanguages") val spokenLanguages: List<SpokenLanguageEntity>,
    @ColumnInfo(name = "status") val status: String,
    @ColumnInfo(name = "tagline") val tagline: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "trailers") val trailers: TrailersEntity,
    @ColumnInfo(name = "video") val video: Boolean,
    @ColumnInfo(name = "videos") val videos: VideosEntity,
    @ColumnInfo(name = "voteAverage") val voteAverage: Double,
    @ColumnInfo(name = "voteCount") val voteCount: Int,
)