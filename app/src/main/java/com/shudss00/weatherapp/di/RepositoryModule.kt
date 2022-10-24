package com.shudss00.weatherapp.di

import com.shudss00.weatherapp.data.location.DefaultLocationTracker
import com.shudss00.weatherapp.data.repository.WeatherRepositoryImpl
import com.shudss00.weatherapp.domain.location.LocationTracker
import com.shudss00.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}
