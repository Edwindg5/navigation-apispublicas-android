package com.alilopez.kt_demohilt.features.rickandmorty.data.di

import com.alilopez.kt_demohilt.core.di.RickAndMortyRetrofit
import com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.remote.api.RickAndMortyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RickAndMortyNetworkModule {
    @Provides
    @Singleton
    fun provideRickAndMortyApi(@RickAndMortyRetrofit retrofit: Retrofit): RickAndMortyApi {
        return retrofit.create(RickAndMortyApi::class.java)
    }
}
