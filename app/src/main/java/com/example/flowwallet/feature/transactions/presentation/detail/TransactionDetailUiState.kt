package com.example.flowwallet.feature.transactions.presentation.detail

import com.example.flowwallet.core.mvi.UiState

data class TransactionDetailUiState(
    val transactionId: String,
) : UiState
