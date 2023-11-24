package com.example.roomsample.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.roomsample.data.SampleData

@Composable
fun Home(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(factory = HomeViewModel.factory),
) {

    val testDataList by viewModel.getAll().collectAsState(initial = emptyList())

    LazyColumn(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        items(testDataList) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(text = "id: ${it.id}", fontSize = 24.sp)
                Text(text = it.name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Divider()
            }
        }
    }
}


















