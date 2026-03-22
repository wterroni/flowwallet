package com.example.flowwallet.feature.transactions.presentation.list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun TransactionsListRoute(
    onOpenTransactionDetail: (transactionId: String) -> Unit,
    onNavigateUp: () -> Unit,
) {
    val viewModel: TransactionsViewModel = koinViewModel()
    val state = viewModel.state.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.onIntent(TransactionsUiIntent.Load)
    }

    TransactionsListScreen(
        state = state.value,
        onOpenTransactionDetail = onOpenTransactionDetail,
    )
}
