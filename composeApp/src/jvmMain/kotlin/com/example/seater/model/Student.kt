package com.example.seater.model

import kotlinx.serialization.Serializable

@Serializable
enum class RowPref{
    None, Front, Middle, Back
}

@Serializable
enum class ColPref{
    None, Left, Middle, Right
}

@Serializable
data class Preference(
    val rowPref: RowPref = RowPref.None,
    val colPref: ColPref = ColPref.None,
    val friends: List<Int> = emptyList(),
    val enemies: List<Int> = emptyList(),
)

@Serializable
data class Student(
    val name: String,
    val nickname: String,
    val pref: Preference,
)