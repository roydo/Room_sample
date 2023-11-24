package com.example.roomsample.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SampleDataDao {
    @Query("SELECT * from test")
    fun getAll(): Flow<List<SampleData>>

    @Query("SELECT * from test WHERE id == 1")
    fun getIdOne(): Flow<SampleData>
}