package com.arcode.eamovies.utils.converters

import androidx.room.TypeConverter
import com.arcode.eamovies.data.database.model.*
import com.google.gson.Gson

class ModelConverter{

    @TypeConverter
    fun fromBelongsToCollection(belongsToCollection: List<BelongsToCollectionsEntity>): String {
        return Gson().toJson(belongsToCollection)
    }

    @TypeConverter
    fun toBelongsToCollection(belongsToCollection: String): List<BelongsToCollectionsEntity> {
        return Gson().fromJson(belongsToCollection, Array<BelongsToCollectionsEntity>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromProductionCompanyEntity(company: List<ProductionCompanyEntity>): String {
        return Gson().toJson(company)
    }

    @TypeConverter
    fun toProductionCompanyEntity(company: String): List<ProductionCompanyEntity> {
        return Gson().fromJson(company, Array<ProductionCompanyEntity>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromProductionCountryEntity(country: List<ProductionCountryEntity>): String {
        return Gson().toJson(country)
    }

    @TypeConverter
    fun toProductionCountryEntity(country: String): List<ProductionCountryEntity> {
        return Gson().fromJson(country, Array<ProductionCountryEntity>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromReviewsEntity(review: ReviewsEntity): String {
        return Gson().toJson(review)
    }

    @TypeConverter
    fun toReviewsEntity(review: String): ReviewsEntity {
        return Gson().fromJson(review, ReviewsEntity::class.java)
    }

    @TypeConverter
    fun fromResultReviewEntity(result: List<ResultReviewEntity>): String {
        return Gson().toJson(result)
    }

    @TypeConverter
    fun toResultReviewEntity(result: String): List<ResultReviewEntity> {
        return Gson().fromJson(result, Array<ResultReviewEntity>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromYoutubeEntity(result: List<YoutubeEntity>): String {
        return Gson().toJson(result)
    }

    @TypeConverter
    fun toYoutubeEntity(result: String): List<YoutubeEntity> {
        return Gson().fromJson(result, Array<YoutubeEntity>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromResultVideoEntity(result: List<ResultVideoEntity>): String {
        return Gson().toJson(result)
    }

    @TypeConverter
    fun toResultVideoEntity(result: String): List<ResultVideoEntity> {
        return Gson().fromJson(result, Array<ResultVideoEntity>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromSpokenLanguageEntity(language: List<SpokenLanguageEntity>): String {
        return Gson().toJson(language)
    }

    @TypeConverter
    fun toSpokenLanguageEntity(language: String): List<SpokenLanguageEntity> {
        return Gson().fromJson(language, Array<SpokenLanguageEntity>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromTrailersEntity(trailers: TrailersEntity): String {
        return Gson().toJson(trailers)
    }

    @TypeConverter
    fun toTrailersEntity(trailers: String): TrailersEntity {
        return Gson().fromJson(trailers, TrailersEntity::class.java)
    }

    @TypeConverter
    fun fromVideosEntity(videos: VideosEntity): String {
        return Gson().toJson(videos)
    }

    @TypeConverter
    fun toVideosEntity(videos: String): VideosEntity {
        return Gson().fromJson(videos, VideosEntity::class.java)
    }

    /**
     * Convert a list of genre a string to store in the database
     */
    @TypeConverter
    fun fromGenreList(genreList: List<GenreEntity>): String {
        val gson = Gson()
        return gson.toJson(genreList)
    }

    /**
     * Convert a string to a list of genre
     */
    @TypeConverter
    fun toGenreList(genreString: String): List<GenreEntity> {
        val gson = Gson()
        return gson.fromJson(genreString, Array<GenreEntity>::class.java).toList()
    }

    @TypeConverter
    fun fromAnyListEntity(result: List<Any>): String {
        return Gson().toJson(result)
    }

    @TypeConverter
    fun toAnyListEntity(result: String): List<Any> {
        return Gson().fromJson(result, Array<Any>::class.java)
            .toList()
    }

    @TypeConverter
    fun fromAnyEntity(result: Any): String {
        return Gson().toJson(result)
    }

    @TypeConverter
    fun toAnyEntity(result: String): Any {
        return Gson().fromJson(result, Any::class.java)
    }

    @TypeConverter
    fun fromAuthorDetailsEntity(videos: AuthorDetailsEntity): String {
        return Gson().toJson(videos)
    }

    @TypeConverter
    fun toAuthorDetailsEntity(videos: String): AuthorDetailsEntity {
        return Gson().fromJson(videos, AuthorDetailsEntity::class.java)
    }


}