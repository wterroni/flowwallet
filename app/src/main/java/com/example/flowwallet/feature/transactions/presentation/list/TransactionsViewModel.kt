package com.example.flowwallet.feature.transactions.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.flowwallet.core.mvi.MviViewModel
import com.example.flowwallet.feature.transactions.domain.GetTransactions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class TransactionsViewModel(
    private val getTransactions: GetTransactions,
) : ViewModel(), MviViewModel<TransactionsUiState, TransactionsUiIntent, TransactionsUiEffect> {

    private val _state = MutableStateFlow(TransactionsUiState())
    override val state: StateFlow<TransactionsUiState> = _state.asStateFlow()

    private val _effects = MutableSharedFlow<TransactionsUiEffect>()
    override val effects: Flow<TransactionsUiEffect> = _effects.asSharedFlow()

    override fun onIntent(intent: TransactionsUiIntent) {
        when (intent) {
            TransactionsUiIntent.Load -> load()
        }
    }

    fun load() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, errorMessage = null) }
            runCatching { getTransactions() }
                .onSuccess { list ->
                    _state.update { it.copy(isLoading = false, transactions = list) }
                }
                .onFailure { error ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = error.message ?: "Unknown error",
                        )
                    }
                }
        }
    }
}
