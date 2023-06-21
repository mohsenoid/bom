package com.mohsenoid.example.app

import android.os.Bundle
import android.widget.Toast
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
import com.mohsenoid.x_lib.Logger
import com.mohsenoid.x_lib.XLib

class MainActivity : ComponentActivity() {

    private val logger = object : Logger {
        override fun log(message: String) {
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
        }
    }

    private val xLib: XLib = XLib(logger = logger)

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
                        onClick = xLib::doYourJob,
                        text = "Action",
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
            text = "Action"
        )
    }
}
