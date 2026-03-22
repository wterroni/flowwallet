package com.example.flowwallet.feature.transactions.presentation.list

import com.example.flowwallet.core.mvi.UiState
import com.example.flowwallet.feature.transactions.domain.Transaction

data class TransactionsUiState(
    val isLoading: Boolean = false,
    val transactions: List<Transaction> = emptyList(),
    val errorMessage: String? = null,
) : UiState
