package com.example.taskmanagerscreen

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerscreen.ui.theme.TaskManagerScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskCompleted(
                        message = getString(R.string.task_completed_message),
                        congratulation = getString(R.string.congratulations_message),
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun TaskCompleted(message: String, congratulation: String, modifier: Modifier = Modifier) {
     Column (
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally,
         modifier = modifier
     ) {
         Image(
             painter = painterResource(R.drawable.ic_task_completed),
             contentDescription = null,
         )
         Text(
             text = message,
             fontWeight = FontWeight.Bold,
             modifier = Modifier
                 .padding(
                     top = 24.dp,
                     bottom = 8.dp
                     )
         )
         Text(
             text = congratulation,
             fontSize = 16.sp

         )
     }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletedPreview() {
    TaskManagerScreenTheme {
        TaskCompleted(
            message = stringResource(R.string.task_completed_message) ,
            congratulation = stringResource(R.string.congratulations_message)
        )
    }
}