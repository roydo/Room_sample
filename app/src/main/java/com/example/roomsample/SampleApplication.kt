package com.example.roomsample

import android.app.Application
import com.example.roomsample.data.SampleAppContainer
import com.example.roomsample.data.SampleDataRepository

interface AppContainer {
    val sampleDataRepository: SampleDataRepository
}

class SampleApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = SampleAppContainer(this)
    }
}