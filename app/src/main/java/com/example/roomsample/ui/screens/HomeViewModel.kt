package com.example.roomsample.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomsample.SampleApplication
import com.example.roomsample.data.SampleData
import com.example.roomsample.data.SampleDataRepository
import kotlinx.coroutines.flow.Flow

class HomeViewModel(private val sampleDataRepository: SampleDataRepository): ViewModel() {
    fun getAll(): Flow<List<SampleData>>
    = sampleDataRepository.getAll()

    fun getIdOne(): Flow<SampleData>
    = sampleDataRepository.getIdOne()

    companion object {
        val factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as SampleApplication)
                HomeViewModel(application.container.sampleDataRepository)
            }
        }
    }
}