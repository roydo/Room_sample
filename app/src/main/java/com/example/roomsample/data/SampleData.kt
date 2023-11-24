package com.example.roomsample.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test")
data class SampleData(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String
)