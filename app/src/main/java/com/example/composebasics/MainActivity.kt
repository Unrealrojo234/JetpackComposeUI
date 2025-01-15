package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Use the padding provided by Scaffold
                    HomePage(
                        modifier = Modifier.padding(innerPadding),
                        title = getString(R.string.title),
                        firstText = getString(R.string.first_text),
                        secondText = getString(R.string.second_text)
                    )
                }
            }
        }
    }
}

@Composable
fun HomePage(
    modifier: Modifier = Modifier,
    title: String,
    firstText: String,
    secondText: String
) {
    Column(
        modifier = modifier,

    ) {
        ImageComposable(modifier = modifier)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = firstText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = secondText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


@Composable
fun ImageComposable(modifier: Modifier){
    val image = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null
    )
}

@Preview(showBackground = true, name = "Homepage Preview")
@Composable
fun HomePagePreview() {
    ComposeBasicsTheme {
        HomePage(
            title = stringResource(R.string.title),      // Use hardcoded strings for preview
            firstText = stringResource(R.string.first_text),     // Use hardcoded strings for preview
            secondText = stringResource(R.string.second_text)    // Use hardcoded strings for preview
        )
    }
}