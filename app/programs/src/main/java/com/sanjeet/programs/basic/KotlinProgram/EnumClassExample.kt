package com.sanjeet.programs.basic.KotlinProgram

/**
 * Enum class is a set of fixed constant.
 * enum keyword is used to declare enum class.
 * Each constant can have only single value.
 */
enum class Color {
    RED,
    BLUE,
    GREEN,
    YELLOW
}

fun main(){
    println(Color.GREEN)
}