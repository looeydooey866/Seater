package com.example.seater.model

import kotlinx.serialization.Serializable

@Serializable
data class Seat(
    val x: Double,
    val y: Double,
    /**
     * Calculated in radians
     */
    val rot: Double,
)