package com.example.flowwallet.app

import android.app.Application
import com.example.flowwallet.app.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FlowWalletApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@FlowWalletApplication)
            modules(appModules)
        }
    }
}
