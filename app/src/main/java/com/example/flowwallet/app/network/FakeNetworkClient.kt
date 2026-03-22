package com.example.flowwallet.app.network

import com.example.flowwallet.platform.network.api.NetworkClient

class FakeNetworkClient : NetworkClient {
    override suspend fun <T> get(url: String): T {
        throw UnsupportedOperationException("FakeNetworkClient.get is not implemented yet")
    }
}
