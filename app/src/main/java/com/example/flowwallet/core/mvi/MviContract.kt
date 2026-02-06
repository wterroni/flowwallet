package com.example.flowwallet.core.mvi

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.Flow

interface UiState

interface UiIntent

interface UiEffect

interface MviViewModel<S : UiState, I : UiIntent, E : UiEffect> {
    val state: StateFlow<S>
    val effects: Flow<E>

    fun onIntent(intent: I)
}
