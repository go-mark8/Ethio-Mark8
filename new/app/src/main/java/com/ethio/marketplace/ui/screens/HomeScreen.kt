
package com.ethio.marketplace.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    Surface {
        Text(
            text = "ETHIO Marketplace is Running 🚀",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}
