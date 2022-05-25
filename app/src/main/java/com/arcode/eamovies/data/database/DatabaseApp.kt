package com.arcode.eamovies.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.arcode.eamovies.data.database.dao.DatabaseDao
import com.arcode.eamovies.data.database.model.*
import com.arcode.eamovies.utils.constants.Constants.DATABASE_VERSION
import com.arcode.eamovies.utils.converters.IntegerListConverter
import com.arcode.eamovies.utils.converters.DateConverter
import com.arcode.eamovies.utils.converters.ModelConverter


@Database(
    entities = [
        MovieEntity::class,
        MovieDetailEntity::class,
        GenreEntity::class,
        ProductionCompanyEntity::class,
        ProductionCountryEntity::class,
        ReviewsEntity::class,
        SpokenLanguageEntity::class,
        TrailersEntity::class,
        VideosEntity::class,
        ResultReviewEntity::class,
        AuthorDetailsEntity::class,
        YoutubeEntity::class,
        ResultVideoEntity::class,
        BelongsToCollectionsEntity::class
    ],
    version = DATABASE_VERSION,
    exportSchema = false
)
@TypeConverters(
    IntegerListConverter::class,
    DateConverter::class,
    ModelConverter::class
)
abstract class DatabaseApp : RoomDatabase() {
    abstract fun apiDao(): DatabaseDao
}