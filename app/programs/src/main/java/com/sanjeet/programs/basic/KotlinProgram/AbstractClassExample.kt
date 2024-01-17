package com.sanjeet.programs.basic.KotlinProgram

/*
* Abstract class is declared using abstract keyword.
* It can contain abstract method as well as concrete method.
* We can not create the object of an abstract class.
* It is used to achieve the partially abstraction functionality.
* All member like data member and function member of abstract class treated as non-abstract by default.
* To make them abstract we need to use abstract keyword with data and function member.
 */
abstract class AbstractClass{

    abstract val name:String

    abstract fun userDetails(name:String,age:Int)

    fun userAddress(city:String,pinCode:Int){
        println("User city from AbstractClass from non-abstract method is $city")
        println("User pinCode is $pinCode")
    }
}

class AbstractClassExampleImpl(override val name: String) : AbstractClass(){

    override fun userDetails(name: String, age: Int) {
        println("Abstract Method from Abstract Class user name is $name")
        println("Abstract Method from Abstract Class user age is $age")
    }

    fun showUserName(){
        println("User name using abstract property $name")
        println("User DOB using AbstractClassExampleImpl is 13/12/1996")
    }
}

fun main(){
    val abstractClassExampleImplObj = AbstractClassExampleImpl("Sanjeet")
    abstractClassExampleImplObj.showUserName()
    abstractClassExampleImplObj.userAddress("Gajraula",24)
    abstractClassExampleImplObj.userDetails("Ranjeet",25)
}