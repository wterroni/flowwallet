package com.example.flowwallet.feature.transactions.presentation.detail

import androidx.lifecycle.ViewModel
import com.example.flowwallet.core.mvi.MviViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

class TransactionDetailViewModel(
    transactionId: String,
) : ViewModel(), MviViewModel<TransactionDetailUiState, TransactionDetailUiIntent, Nothing> {

    private val _state = MutableStateFlow(TransactionDetailUiState(transactionId = transactionId))
    override val state: StateFlow<TransactionDetailUiState> = _state.asStateFlow()

    private val _effects = MutableSharedFlow<Nothing>()
    override val effects: Flow<Nothing> = _effects.asSharedFlow()

    override fun onIntent(intent: TransactionDetailUiIntent) {
        // No intents for now
    }
}
