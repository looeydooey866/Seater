package com.example.seater.model

import kotlinx.serialization.Serializable

@Serializable
data class Arrangement(
    val name: String,
    val occupant: List<Int>
)
