package com.example.weatherapp

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ForecastSection() {
    Column {
        repeat(3) { index ->
            ForecastCard(day = "Day ${index + 1}", temp = "${22 + index}°C")
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
