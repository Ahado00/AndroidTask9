package com.example.weatherapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.os.ConfigurationCompat

@Composable
fun getLocalizedString(enText: String): String {
    val context = LocalContext.current
    val locale = ConfigurationCompat.getLocales(context.resources.configuration)[0]
    return when (locale?.language) {
        "ar" -> when (enText) {
            "Current Weather" -> "الطقس الحالي"
            "Day 1" -> "اليوم الأول"
            "Day 2" -> "اليوم الثاني"
            "Day 3" -> "اليوم الثالث"
            else -> enText
        }
        else -> enText
    }
}