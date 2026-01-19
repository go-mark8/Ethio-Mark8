
package com.ethio.marketplace
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ethio.marketplace.ui.home.MainScaffold
import com.ethio.marketplace.ui.theme.ETHIOTheme

class MainActivity: ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent { ETHIOTheme { MainScaffold() } }
 }
}
