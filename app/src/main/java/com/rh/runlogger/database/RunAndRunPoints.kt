package com.rh.runlogger.database

import androidx.room.Embedded
import androidx.room.Relation

data class RunAndRunPoints(
    @Embedded
    val run: Run,

    @Relation(
        parentColumn = "id",
        entityColumn = "run_id"
    )
    val runPoints: List<RunPoint>
)