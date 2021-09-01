package com.rh.runlogger.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        Run::class,
        RunPoint::class
    ],
    version = 1
)
abstract class RunDatabase : RoomDatabase() {

    abstract fun runCollection() : RunCollection
}