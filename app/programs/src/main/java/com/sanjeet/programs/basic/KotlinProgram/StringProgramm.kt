package com.sanjeet.programs.basic.KotlinProgram

fun main() {
    reverseString()
}


fun reverseString(){
    val name:String = "Snajeet Kumar"
    for (item in name){
        println(item)
    }
    for ((value,index) in name.withIndex()){
        println(value)
    }}