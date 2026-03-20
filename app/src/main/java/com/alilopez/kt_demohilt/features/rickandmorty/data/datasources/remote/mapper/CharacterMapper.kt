package com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.remote.mapper

import com.alilopez.kt_demohilt.features.rickandmorty.data.datasources.remote.models.CharacterDto
import com.alilopez.kt_demohilt.features.rickandmorty.domain.entities.Character

fun CharacterDto.toDomain(): Character {
    return Character(
        id = this.id,
        name = this.name,
        status = this.status,
        species = this.species,
        gender = this.gender,
        image = this.image
    )
}
