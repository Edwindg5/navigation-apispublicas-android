package com.alilopez.kt_demohilt.features.rickandmorty.presentation.screens

import com.alilopez.kt_demohilt.features.rickandmorty.domain.entities.Character

data class RickAndMortyUIState(
    val isLoading: Boolean = false,
    val characters: List<Character> = emptyList(),
    val error: String? = null
)
