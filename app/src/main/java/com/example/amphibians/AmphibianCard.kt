package com.example.amphibians

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun AmphibianCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Mostrar el nombre del anfibio alineado a la izquierda
            Text(
                text = "Amphibian Name",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth(), // Asegura que el texto ocupe todo el ancho disponible
                textAlign = TextAlign.Start // Alinear el texto a la izquierda
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Mostrar el tipo de anfibio alineado a la izquierda
            Text(
                text = "Type: Amphibian Type",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier
                    .fillMaxWidth(), // Asegura que el texto ocupe todo el ancho disponible
                textAlign = TextAlign.Start // Alinear el texto a la izquierda
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Imagen placeholder
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(Color.Gray), // Representación de una imagen
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Image",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Mostrar la descripción del anfibio alineada a la izquierda
            Text(
                text = "Description: This is a placeholder description for the amphibian.",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .fillMaxWidth(), // Asegura que el texto ocupe todo el ancho disponible
                textAlign = TextAlign.Justify // Alinear el texto con justificación
            )
        }
    }
}


@Preview
@Composable
fun PreviewAmphibianCard() {
    MaterialTheme {
        AmphibianCard()
    }
}
