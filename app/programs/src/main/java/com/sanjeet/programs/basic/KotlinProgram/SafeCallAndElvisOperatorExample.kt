package com.sanjeet.programs.basic.KotlinProgram

fun main() {
    safeCallOperator()
    elvisOperator()
}

fun safeCallOperator(){

    var name :String? = "Sanjeet Kumar";
    println(name)
    name = null;
    println(name?.length)
}

fun elvisOperator(){
    var name :String? = "Ranjeet Ji"
    println(name)
    name = null
    println(name?:"Default name is Mukes")
}