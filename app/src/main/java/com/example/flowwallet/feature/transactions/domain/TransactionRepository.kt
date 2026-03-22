package com.example.flowwallet.feature.transactions.domain

interface TransactionRepository {
    suspend fun getTransactions(): List<Transaction>
}
