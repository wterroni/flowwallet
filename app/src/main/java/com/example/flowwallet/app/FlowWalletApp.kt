package com.example.flowwallet.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.flowwallet.app.navigation.FlowWalletNavHost

@Composable
fun FlowWalletApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    FlowWalletNavHost(
        navController = navController,
        modifier = modifier,
    )
}
