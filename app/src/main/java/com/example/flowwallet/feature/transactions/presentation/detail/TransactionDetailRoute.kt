package com.example.flowwallet.feature.transactions.presentation.detail

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun TransactionDetailRoute(
    onNavigateUp: () -> Unit,
    transactionId: String,
) {
    val viewModel: TransactionDetailViewModel = koinViewModel {
        parametersOf(transactionId)
    }
    val state = viewModel.state.collectAsState()

    TransactionDetailScreen(
        state = state.value,
    )
}
