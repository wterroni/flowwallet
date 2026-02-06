package com.example.flowwallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.flowwallet.app.FlowWalletApp
import com.example.flowwallet.ui.theme.FlowWalletTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlowWalletTheme {
                FlowWalletApp()
            }
        }
    }
}