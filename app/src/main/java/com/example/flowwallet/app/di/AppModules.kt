package com.example.flowwallet.app.di

import com.example.flowwallet.app.network.FakeNetworkClient
import com.example.flowwallet.feature.transactions.data.FakeTransactionRepository
import com.example.flowwallet.feature.transactions.domain.GetTransactions
import com.example.flowwallet.feature.transactions.domain.TransactionRepository
import com.example.flowwallet.feature.transactions.presentation.detail.TransactionDetailViewModel
import com.example.flowwallet.feature.transactions.presentation.list.TransactionsViewModel
import com.example.flowwallet.platform.network.api.NetworkClient
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    single<NetworkClient> { FakeNetworkClient() }

    single<TransactionRepository> { FakeTransactionRepository(networkClient = get()) }
    factory { GetTransactions(repository = get()) }

    viewModel { TransactionsViewModel(getTransactions = get()) }
    viewModel { (transactionId: String) -> TransactionDetailViewModel(transactionId = transactionId) }
}

val appModules: List<Module> = listOf(
    appModule,
)
