package com.alilopez.kt_demohilt.features.rickandmorty.domain.usescases

import com.alilopez.kt_demohilt.features.rickandmorty.domain.entities.Character
import com.alilopez.kt_demohilt.features.rickandmorty.domain.repositories.RickAndMortyRepository
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: RickAndMortyRepository
) {
    suspend operator fun invoke(): Result<List<Character>> {
        return try {
            val characters = repository.getCharacters()
            Result.success(characters)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
