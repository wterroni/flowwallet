package com.example.flowwallet.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.example.flowwallet.feature.dashboard.presentation.DashboardRoute
import com.example.flowwallet.feature.settings.presentation.SettingsRoute
import com.example.flowwallet.feature.transactions.presentation.detail.TransactionDetailRoute
import com.example.flowwallet.feature.transactions.presentation.list.TransactionsListRoute

@Composable
fun FlowWalletNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Dashboard,
        modifier = modifier,
    ) {
        composable(route = Routes.Dashboard) {
            DashboardRoute(
                onOpenTransactions = { navController.navigate(Routes.TransactionsList) },
                onOpenSettings = { navController.navigate(Routes.Settings) },
            )
        }

        composable(route = Routes.TransactionsList) {
            TransactionsListRoute(
                onOpenTransactionDetail = { transactionId ->
                    navController.navigate("${Routes.TransactionDetailBase}/$transactionId")
                },
                onNavigateUp = { navController.navigateUp() },
            )
        }

        composable(
            route = Routes.TransactionDetail,
            arguments = listOf(
                navArgument(Routes.TransactionIdArg) { type = NavType.StringType },
            ),
        ) {
            TransactionDetailRoute(
                onNavigateUp = { navController.navigateUp() },
            )
        }

        composable(route = Routes.Settings) {
            SettingsRoute(
                onNavigateUp = { navController.navigateUp() },
            )
        }
    }
}
