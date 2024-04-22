package com.example.gridcourses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gridcourses.model.Course
import com.example.gridcourses.ui.theme.GridCoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GridCoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseGrid()
                }
            }
        }
    }
}

@Composable
fun CourseGrid() {

}

@Composable
fun CourseCard(course: Course, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Row(modifier = modifier) {
            Box(modifier = modifier) {
                Image(
                    painter = painterResource(id = course.imageResource),
                    contentDescription = stringResource(id = course.nameResource),
                    modifier = Modifier
                        .size(height = 68.dp, width = 68.dp)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
            }

            Column {
                Text(
                    text = stringResource(id = course.nameResource),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(
                        start = dimensionResource(id = R.dimen.padding_medium),
                        top = dimensionResource(id = R.dimen.padding_medium),
                        end = dimensionResource(id = R.dimen.padding_medium),
                        bottom = dimensionResource(id = R.dimen.padding_small)
                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(
                                start = dimensionResource(id = R.dimen.padding_medium)
                            )
                    )
                    Text(
                        text = course.numberOfCourses.toString(),
                        style = MaterialTheme.typography.labelSmall,
                        modifier = Modifier.padding(
                            start = dimensionResource(id = R.dimen.padding_small)
                        )
                    )
                }
            }
        }

    }
}

@Preview
@Composable
private fun CourseCardPreview() {
    CourseCard(course = Course(R.string.tech, 5, R.drawable.tech))
}
