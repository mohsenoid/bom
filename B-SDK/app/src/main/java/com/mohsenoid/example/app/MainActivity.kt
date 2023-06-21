package com.mohsenoid.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mohsenoid.example.app.ui.theme.ExampleAppTheme
import com.mohsenoid.sdk.b.BSdk

class MainActivity : ComponentActivity() {

    private val bSdk = BSdk(context = this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ActionButton(
                        onClick = bSdk::doYourJob,
                        text = "Action B",
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ActionButton(onClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExampleAppTheme {
        ActionButton(
            onClick = {},
            text = "Action B"
        )
    }
}
