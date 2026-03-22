package com.example.flowwallet.feature.transactions.presentation.list

import com.example.flowwallet.core.mvi.UiIntent

sealed interface TransactionsUiIntent : UiIntent {
    data object Load : TransactionsUiIntent
}
