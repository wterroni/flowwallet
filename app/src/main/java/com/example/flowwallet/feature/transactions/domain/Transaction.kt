package com.example.flowwallet.feature.transactions.domain

data class Transaction(
    val id: String,
    val description: String,
    val amount: Double,
)
