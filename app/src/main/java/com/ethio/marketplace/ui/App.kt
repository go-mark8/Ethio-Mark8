
package com.ethio.marketplace.ui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ethio.marketplace.ui.screens.HomeScreen
import com.ethio.marketplace.ui.theme.EthioTheme

@Composable
fun App() {
    EthioTheme {
        HomeScreen()
    }
}
