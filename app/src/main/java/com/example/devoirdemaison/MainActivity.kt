package com.example.devoirdemaison

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.devoirdemaison.ui.theme.DEVOIRDEMAISONTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DEVOIRDEMAISONTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteDeVisite(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CarteDeVisite(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize().background(Color.Black),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image (
                painterResource(R.drawable.android_logo),
                contentDescription = "Logo",
                modifier = Modifier.size(200.dp)
            )
            Text (
                text = "N'GUESSAN NIAMELET PAUL MARIE A.",
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White
                ),
                modifier = Modifier.padding(40.dp, 0.dp)
            )
            Text (
                text = "Développeur d'applications mobiles",
                style = TextStyle(
                    fontSize = 21.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White
                ),
                modifier = Modifier.padding(40.dp, 25.dp, 40.dp, 0.dp)
            )
        }
        Column {
            LigneCarteDeVisite("nguessanpaulo17@gmail.com", Icons.Filled.Email)
            LigneCarteDeVisite("+225 07 89 70 20 81", Icons.Filled.Phone)
            LigneCarteDeVisite("Abidjan, YOPOUGON MILLIONNAIRE", Icons.Filled.LocationOn)
        }
    }
}

@Composable
fun LigneCarteDeVisite(content: String, icon: ImageVector) {
    Row (
        modifier = Modifier.padding(70.dp, 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            icon,
            contentDescription = "Icon",
            tint = Color.White,
            modifier = Modifier.size(20.dp)
        )
        Text(
            content,
            style = TextStyle(
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                color = Color.White
            ),
            modifier = Modifier.weight(1f).padding(start = 15.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CarteDeVisitePreview() {
    DEVOIRDEMAISONTheme {
        CarteDeVisite()
    }
}
