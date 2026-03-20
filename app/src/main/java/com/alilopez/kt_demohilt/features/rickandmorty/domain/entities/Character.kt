package com.alilopez.kt_demohilt.features.rickandmorty.domain.entities

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val gender: String,
    val image: String
)
