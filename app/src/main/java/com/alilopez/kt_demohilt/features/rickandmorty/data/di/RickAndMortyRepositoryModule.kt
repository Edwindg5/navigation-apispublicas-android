package com.alilopez.kt_demohilt.features.rickandmorty.data.di

import com.alilopez.kt_demohilt.features.rickandmorty.data.repositories.RickAndMortyRepositoryImpl
import com.alilopez.kt_demohilt.features.rickandmorty.domain.repositories.RickAndMortyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RickAndMortyRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindRickAndMortyRepository(
        impl: RickAndMortyRepositoryImpl
    ): RickAndMortyRepository
}
