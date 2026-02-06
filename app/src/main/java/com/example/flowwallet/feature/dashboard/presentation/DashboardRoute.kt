package com.example.flowwallet.feature.dashboard.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DashboardRoute(
    onOpenTransactions: () -> Unit,
    onOpenSettings: () -> Unit,
) {
    Text("Dashboard")
}
