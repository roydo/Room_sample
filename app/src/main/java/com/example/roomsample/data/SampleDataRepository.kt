package com.example.roomsample.data

import kotlinx.coroutines.flow.Flow


class SampleDataRepository(private val sampleDataDao: SampleDataDao) {
    fun getAll(): Flow<List<SampleData>>
    = sampleDataDao.getAll()

    fun getIdOne(): Flow<SampleData>
    = sampleDataDao.getIdOne()
}