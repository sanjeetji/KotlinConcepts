package com.sanjeet.programs.basic.KotlinProgram

/**
 * Interface is a blue print of a class.
 * interface keyword is used to declare an interface.
 * It can contain abstract method as well as concert method.
 * All Method without their body are abstract by default in interface.
 * Interface is used to support the multiple inheritance.
 * Interface is used to achieve fully abstraction.
 * Interface is used to achieve loos coupling.
 */

interface InterfaceExample{

    val name:String
    val age: Int
        get() = 25

    fun showUserNameAndAge(name:String,age:Int)

    fun showUserCityAndPost(city:String,post:String){
        println("User city using interface method with implementation is $city")
        println("User post using interface method with implementation is $post")
    }

}

class InterfaceExampleImpl(override val name: String) : InterfaceExample{

    override fun showUserNameAndAge(name: String, age: Int) {
        println("User name using interface abstract method is $name")
        println("User age using interface abstract method is $age")
    }

    fun showUserName(name:String){
        println("User name in implement class is $name")
    }

}

fun main() {
    val interfaceExampleImplObj = InterfaceExampleImpl("Sanjeet Kumar Parjapati")
    interfaceExampleImplObj.showUserName("Sanjeet Ji")
    interfaceExampleImplObj.showUserNameAndAge("Sanjeet Kumar",24)
    interfaceExampleImplObj.showUserCityAndPost("Gajrault","Negliya Mev")
    println("User name using abstract property from interface ${interfaceExampleImplObj.name}")
    println("User name using non-abstract property from interface ${interfaceExampleImplObj.age}")

}