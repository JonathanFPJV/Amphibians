package com.example.amphibians

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AmphibianViewModel : ViewModel() {

    private val _amphibians = MutableStateFlow<List<Amphibian>>(emptyList())
    val amphibians: StateFlow<List<Amphibian>> = _amphibians

    init {
        getAmphibiansData()
    }

    private fun getAmphibiansData() {
        viewModelScope.launch {
            try {
                _amphibians.value = Network.amphibianApiService.getAmphibians()
            } catch (e: Exception) {
                // Maneja el error
            }
        }
    }
}
