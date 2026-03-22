package com.example.flowwallet.feature.transactions.data

import com.example.flowwallet.feature.transactions.domain.Transaction
import com.example.flowwallet.feature.transactions.domain.TransactionRepository
import com.example.flowwallet.platform.network.api.NetworkClient

class FakeTransactionRepository(
    private val networkClient: NetworkClient,
) : TransactionRepository {

    override suspend fun getTransactions(): List<Transaction> {
        return listOf(
            Transaction(id = "t1", description = "Coffee", amount = -12.50),
            Transaction(id = "t2", description = "Salary", amount = 3500.00),
            Transaction(id = "t3", description = "Groceries", amount = -210.30),
        )
    }
}
