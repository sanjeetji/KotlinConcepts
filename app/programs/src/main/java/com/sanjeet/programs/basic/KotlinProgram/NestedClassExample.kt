package com.sanjeet.programs.basic.KotlinProgram

class NestedClassExample {

    val name:String = "Sanjeet Kumar Parjapati"
    val age:Int = 25
    fun userDetails(){
        println("User name is $name")
        println("User age is $age")
    }

    class UserAdd{
        val village = "Papsra Khadar"
        val pinCode = 244235
        fun userAddress(){
            println("User village is $village")
            println("User pin code is $pinCode")
        }
    }
}

fun main() {
    val classObj = NestedClassExample()
    println("User name using access object is ${classObj.name}")
    println("User age using access object is ${classObj.age}")
    classObj.userDetails()

    println("===========================")

    println("Access Nested class using outer class ")
    println("Nested class user calling is ${NestedClassExample.UserAdd().village} ")
    val nestedClassObj = NestedClassExample.UserAdd()
    nestedClassObj.userAddress()
}