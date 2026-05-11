package com.example.seater.model

import kotlinx.serialization.Serializable

@Serializable
data class Project(
    val name: String,
    val classroom: Classroom = Classroom(),
    val arrangements: List<Arrangement> = emptyList()
)
