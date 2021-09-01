package com.rh.runlogger.database

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity
data class Run(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "time_started")
    val timeStarted: Long,

    @ColumnInfo(name = "time_stopped")
    val timeStopped: Long,

    @ColumnInfo(name = "distance")
    val distance: Float
)