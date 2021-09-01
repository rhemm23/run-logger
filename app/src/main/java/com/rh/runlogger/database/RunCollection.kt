package com.rh.runlogger.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface RunCollection {

    @Insert
    suspend fun save(run: Run)

    @Insert
    suspend fun save(vararg runPoint: RunPoint)

    @Transaction
    @Query("SELECT * FROM run")
    suspend fun getAll(): List<RunAndRunPoints>

    @Transaction
    @Query("SELECT * FROM run WHERE id = :id")
    suspend fun getById(id: Int): RunAndRunPoints
}