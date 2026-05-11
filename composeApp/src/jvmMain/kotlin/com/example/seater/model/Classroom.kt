package com.example.seater.model

import kotlinx.serialization.Serializable

@Serializable
data class Classroom(
    val students: List<Student> = emptyList(),
    val seats: List<Seat> = emptyList(),
    val width: Double = 1200.0,
    val height: Double = 800.0,
)
