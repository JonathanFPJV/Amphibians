package com.example.amphibians

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit


object Network {
    private val contentType = "application/json".toMediaType()

    // Configura el JSON con kotlinx.serialization
    private val json = Json {
        ignoreUnknownKeys = true // Ignora las claves desconocidas para evitar errores
    }

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://android-kotlin-fun-mars-server.appspot.com/")
        .addConverterFactory(json.asConverterFactory(contentType)) // Utiliza el convertidor kotlinx.serialization
        .build()

    val amphibianApiService: AmphibianApiService by lazy {
        retrofit.create(AmphibianApiService::class.java)
    }
}
