package com.sanjeet.programs.basic.KotlinProgram

class InnerClassExample {

    val name:String = "Mohan Kumar Prajapati"
    val gender:String = "Male"
    fun userBio(){
        println("User name is $name")
        println("User gender is $gender")
    }

    inner class UserAdd{
        val city:String = "Gajraula"
        val post:String = "Negliya Mev"

        fun userAddress(){
            println("User city is $city")
            println("User post is $post")
            println("User name is $name")
        }
    }
}

fun main() {

    println("Outer class Obj creating ")
    val outerClassObje = InnerClassExample()
    outerClassObje.UserAdd()

    println("Inner class details")

    outerClassObje.UserAdd().userAddress()


}