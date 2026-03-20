package com.alilopez.kt_demohilt.features.rickandmorty.domain.repositories

import com.alilopez.kt_demohilt.features.rickandmorty.domain.entities.Character

interface RickAndMortyRepository {
    suspend fun getCharacters(): List<Character>
}
