package com.arcode.eamovies.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcode.eamovies.utils.constants.Constants

@Entity(tableName = Constants.TABLE_NAME_COMPANY)
data class ProductionCompanyEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "company_id") val companyId: Int,
    @ColumnInfo(name = "logo_path") val logoPath: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "origin_country") val originCountry: String,
)