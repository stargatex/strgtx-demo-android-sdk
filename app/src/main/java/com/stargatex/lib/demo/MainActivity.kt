package com.stargatex.lib.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.stargatex.lib.demo.ui.theme.DemoLibAppTheme
import com.stargatex.lib.strgtxdemosdk.config.AccountConfig
import com.stargatex.lib.strgtxdemosdk.config.AccountConfigurationStore
import com.stargatex.lib.strgtxdemosdk.config.DefaultAccountConfiguration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoLibAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val accountConfig: AccountConfig =
                        AccountConfigurationStore.loadAccountConfiguration(
                            DefaultAccountConfiguration(this),
                            R.raw.account
                        )
                    Greeting(accountConfig.name)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoLibAppTheme {
        Greeting("Android")
    }
}