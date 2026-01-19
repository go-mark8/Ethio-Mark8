
package com.ethio.marketplace.ui.home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.*

@Composable
fun MainScaffold() {
 val nav = rememberNavController()
 Scaffold { padding ->
  NavHost(nav, "home") {
   composable("home") { HomeScreen() }
  }
 }
}
