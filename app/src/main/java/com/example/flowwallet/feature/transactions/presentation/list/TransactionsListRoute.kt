package com.example.flowwallet.feature.transactions.presentation.list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TransactionsListRoute(
    onOpenTransactionDetail: (transactionId: String) -> Unit,
    onNavigateUp: () -> Unit,
) {
    Text("Transactions List")
}
