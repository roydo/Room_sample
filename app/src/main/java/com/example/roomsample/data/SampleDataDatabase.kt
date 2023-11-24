package com.example.roomsample.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SampleData::class], version = 1, exportSchema = false)
abstract class SampleDataDatabase: RoomDatabase() {

    abstract fun sampleDataDao(): SampleDataDao

    companion object {
        @Volatile
        private var Instance: SampleDataDatabase? = null

        fun getSampleDataDatabase(context: Context): SampleDataDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context = context,
                    klass = SampleDataDatabase::class.java,
                    name = "test"
                )
                    .createFromAsset("database/test.db")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}