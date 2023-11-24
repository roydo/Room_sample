package com.example.roomsample.data

import android.content.Context
import com.example.roomsample.AppContainer

class SampleAppContainer(private val context: Context): AppContainer {
    override val sampleDataRepository: SampleDataRepository by lazy {
        SampleDataRepository(SampleDataDatabase.getSampleDataDatabase(context).sampleDataDao())
    }
}