package com.shudss00.weatherapp.domain.repository

import com.shudss00.weatherapp.domain.util.Resource
import com.shudss00.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}
