package com.example.flowwallet.feature.transactions.domain

class GetTransactions(
    private val repository: TransactionRepository,
) {
    suspend operator fun invoke(): List<Transaction> = repository.getTransactions()
}
