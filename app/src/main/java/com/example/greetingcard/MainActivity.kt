package com.example.greetingcard
import androidx.compose.foundation.layout.WindowInsets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.HappybirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappybirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Syogen()
                }
            }
        }
    }
}

@Composable
fun Syogen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .statusBarsPadding()
            .fillMaxSize()
    ) {
        Row(Modifier.weight(1f)) {
            SyogenCard(
                bgColor = Color(0xFFEADDFF),
                title = stringResource(R.string.syogen1_title),
                description = stringResource(R.string.syogen1_description),
                modifier = Modifier.weight(1f)
            )
            SyogenCard(
                bgColor = Color(0xFFD0BCFF),
                title = stringResource(R.string.syogen2_title),
                description = stringResource(R.string.syogen2_description),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            SyogenCard(
                bgColor = Color(0xFFB69DF8),
                title = stringResource(R.string.syogen3_title),
                description = stringResource(R.string.syogen3_description),
                modifier = Modifier.weight(1f)
            )
            SyogenCard(
                bgColor = Color(0xFFF6EDFF),
                title = stringResource(R.string.syogen4_title),
                description = stringResource(R.string.syogen4_description),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun SyogenCard(
    bgColor: Color = Color(0xFFEADDFF),
    title: String = "Title Text",
    description: String = "text text text text text",
    modifier: Modifier = Modifier
){
    Surface(
        color = bgColor,
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                modifier = Modifier
                    .padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposePreview() {
    HappybirthdayTheme {
        Syogen()
    }
}
