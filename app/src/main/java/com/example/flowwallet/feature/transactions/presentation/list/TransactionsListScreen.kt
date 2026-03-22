package com.example.flowwallet.feature.transactions.presentation.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TransactionsListScreen(
    state: TransactionsUiState,
    onOpenTransactionDetail: (transactionId: String) -> Unit = {},
) {
    Column(modifier = Modifier.padding(16.dp)) {
        if (state.isLoading) {
            Text("Loading...")
            return
        }

        state.errorMessage?.let {
            Text("Error: $it")
            return
        }

        if (state.transactions.isEmpty()) {
            Text("No transactions")
            return
        }

        state.transactions.forEach { transaction ->
            Text(
                text = "${transaction.description}: ${transaction.amount}",
                modifier = Modifier.clickable { onOpenTransactionDetail(transaction.id) }
            )
        }
    }
}
