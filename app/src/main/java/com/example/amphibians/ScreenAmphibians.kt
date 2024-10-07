package com.example.amphibians

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter


@Composable
fun ScreenAmphibians(navController: NavHostController, service: AmphibianApiService) {
    var amphibians by remember { mutableStateOf<List<AmphibianModel>>(emptyList()) }

    LaunchedEffect(Unit) {
        amphibians = service.getAmphibians()
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(amphibians) { amphibian ->
            AmphibianCard(amphibian)
        }
    }
}

