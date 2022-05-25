package com.arcode.eamovies.utils.converters

import androidx.room.TypeConverter
import java.util.*

open class DateConverter {

    /**
     * Convert a [Long] to a [Date]
     * @param value the [Long] to convert
     * @return the [Date]
     */
    @TypeConverter
    fun fromTimestamp(value: Long): Date {
        return Date(value)
    }

    /**
     * Convert a [Date] to a [Long]
     * @param date the [Date] to convert
     * @return the [Long]
     */
    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}