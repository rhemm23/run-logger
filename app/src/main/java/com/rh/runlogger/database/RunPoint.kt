package com.rh.runlogger.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Run::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("run_id"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class RunPoint(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "run_id", index = true)
    val runId: Int,

    @ColumnInfo(name = "time_logged")
    val timeLogged: Long,

    @ColumnInfo(name = "longitude")
    val longitude: Float,

    @ColumnInfo(name = "latitude")
    val latitude: Float
)