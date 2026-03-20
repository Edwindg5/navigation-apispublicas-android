package com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.remote.models

data class CharacterResponseDto(
    val results: List<CharacterDto>
)

data class CharacterDto(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val gender: String,
    val image: String
)
