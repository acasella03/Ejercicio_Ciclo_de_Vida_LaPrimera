package com.dam.laprimera

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam.laprimera.ui.theme.LaPrimeraTheme

class MainActivity : ComponentActivity() {
    val TAG: String = "Estado"
    val NAME: String = "Android"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaPrimeraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(NAME)
                }

            }
        }
        Log.d(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }
}

@Composable
fun Greeting(NAME: String, modifier: Modifier = Modifier) {
    Column {
            Text(
                text = "Hello $NAME!",
                fontSize = 100.sp,
                color = Color.Blue,
                modifier = modifier
            )
            Text(
                text = "Hello world!",
                fontSize = 10.sp,
                color = Color.Blue,
                modifier = modifier

            )
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LaPrimeraTheme {
        Greeting("Android")
    }
}