package com.example.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.amphibians.ui.theme.AmphibiansTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AmphibiansTheme {
                AmphibianScaffold ()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmphibianScaffold() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Amphibians App") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFF71D274)
                )

            )
        },
        content = { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                // Contenido de la aplicación
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AmphibiansTheme {
        AmphibianScaffold()}}
