package com.alilopez.kt_demohilt.features.rickandmorty.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alilopez.kt_demohilt.features.rickandmorty.domain.usescases.GetCharactersUseCase
import com.alilopez.kt_demohilt.features.rickandmorty.presentation.screens.RickAndMortyUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RickAndMortyViewModel @Inject constructor(
    private val getCharactersUseCase: GetCharactersUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(RickAndMortyUIState())
    val uiState = _uiState.asStateFlow()

    init {
        loadCharacters()
    }

    private fun loadCharacters() {
        _uiState.update { it.copy(isLoading = true) }
        viewModelScope.launch {
            val result = getCharactersUseCase()
            _uiState.update { currentState ->
                result.fold(
                    onSuccess = { list ->
                        currentState.copy(isLoading = false, characters = list)
                    },
                    onFailure = { error ->
                        currentState.copy(isLoading = false, error = error.message)
                    }
                )
            }
        }
    }
}
