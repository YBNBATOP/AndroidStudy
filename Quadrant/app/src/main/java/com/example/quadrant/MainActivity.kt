package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column (Modifier.fillMaxWidth()) {
        Row (Modifier.weight(1f)){
            Quadrant(
                name = stringResource(R.string.text_1),
                message = stringResource(R.string.name_1),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                name = stringResource(R.string.text_2),
                message = stringResource(R.string.name_2),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (Modifier.weight(1f)){
            Quadrant(
                name = stringResource(R.string.text_3),
                message = stringResource(R.string.name_3),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                name = stringResource(R.string.text_4),
                message = stringResource(R.string. name_4),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(name: String, message: String, color: Color, modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .background(color)
                .padding(16.dp)
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(
                        bottom = 16.dp
                    )
            )
            Text(
                text = message,
                textAlign = TextAlign.Justify,
            )
        }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        ComposeQuadrantApp()
    }
}
