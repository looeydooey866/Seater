package com.example.seater.model

// shamelessly copied from rendertest
data object DegreeConstants{
    const val ROD = Math.PI / 180f
    const val DOR = 180f / Math.PI
}

fun Double.toRad(): Double = this * DegreeConstants.ROD
fun Double.toDeg(): Double = this * DegreeConstants.DOR