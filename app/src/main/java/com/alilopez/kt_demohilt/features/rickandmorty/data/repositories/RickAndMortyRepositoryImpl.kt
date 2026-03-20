package com.alilopez.kt_demohilt.features.rickandmorty.data.repositories

import com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.remote.api.RickAndMortyApi
import com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.remote.mapper.toDomain
import com.alilopez.kt_demohilt.features.rickandmorty.domain.entities.Character
import com.alilopez.kt_demohilt.features.rickandmorty.domain.repositories.RickAndMortyRepository
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val api: RickAndMortyApi
) : RickAndMortyRepository {
    override suspend fun getCharacters(): List<Character> {
        return api.getCharacters().results.map { it.toDomain() }
    }
}
