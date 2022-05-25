package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.arcode.eamovies.data.network.model.ResultReview
import com.arcode.eamovies.utils.constants.Constants

@Entity(
    tableName = Constants.TABLE_NAME_REVIEWS,
    foreignKeys = [
        (ForeignKey(
            entity = ResultReview::class,
            parentColumns = ["id"],
            childColumns = ["id"],
            onDelete = ForeignKey.CASCADE
        ))
    ]
)
data class ReviewsEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "page") val page: Int,
    @ColumnInfo(name = "results") val results: List<ResultReviewEntity>,
    @ColumnInfo(name = "total_pages") val totalPages: Int,
    @ColumnInfo(name = "total_results") val totalResults: Int,
)