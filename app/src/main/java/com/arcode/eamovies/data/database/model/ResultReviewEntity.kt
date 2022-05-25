package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(
    tableName = Constants.TABLE_NAME_RESULT_REVIEW,
    foreignKeys = [
        (ForeignKey(entity = AuthorDetailsEntity::class,
            parentColumns = ["id"],
            childColumns = ["id"],
            onDelete = ForeignKey.CASCADE))
    ]
)
data class ResultReviewEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "author") val author: String,
    @ColumnInfo(name = "author_details") val authorDetails: AuthorDetailsEntity,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "created_at") val createdAt: String,
    @ColumnInfo(name = "result_id") val resultId: String,
    @ColumnInfo(name = "updated_at") val updatedAt: String,
    @ColumnInfo(name = "url") val url: String,
)