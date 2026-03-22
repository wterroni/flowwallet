package com.example.flowwallet.feature.transactions.presentation.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TransactionDetailScreen(
    state: TransactionDetailUiState,
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Transaction ID: ${state.transactionId}")
    }
}
