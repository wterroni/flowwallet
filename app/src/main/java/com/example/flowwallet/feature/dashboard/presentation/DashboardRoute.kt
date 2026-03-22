package com.example.flowwallet.feature.dashboard.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardRoute(
    onOpenTransactions: () -> Unit,
    onOpenSettings: () -> Unit,
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Dashboard")
        Button(
            onClick = onOpenTransactions,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Open Transactions")
        }
        Button(
            onClick = onOpenSettings,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Open Settings")
        }
    }
}
