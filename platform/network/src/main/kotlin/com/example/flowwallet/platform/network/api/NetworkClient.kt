package com.example.flowwallet.platform.network.api

interface NetworkClient {
    suspend fun <T> get(url: String): T
}
