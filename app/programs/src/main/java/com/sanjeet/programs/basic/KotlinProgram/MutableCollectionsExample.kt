package com.sanjeet.programs.basic.KotlinProgram

//Mutable List, Set, Map
fun main() {


    //Example of Mutable List
    val mutableList = mutableListOf("Sanjeet","Manjeet",3,4)
    //Different ways to create mutable List
    val  mutableTypeList:MutableList<Int> = mutableListOf(1,3,5,6)
    mutableTypeList.add(4)
    mutableTypeList.set(1,7)
    val  mutableTypeList1:MutableList<Int> = mutableListOf()
    mutableTypeList1.add(9)
    mutableTypeList1.add(6)
    println("List size is ${mutableList.size}")
    mutableList.set(0,"Ram ji")
    mutableList.add(1,"Krishna")
    mutableList.add("Rajveer")
    println("List size is ${mutableList.size}")
    println("Item on 0 index in ${mutableList.get(0)}")
    mutableList.forEach { value -> println("Value of List is $value") }

    println("=============================================================================================")

    //Example of Mutable List
    val mutableSet = mutableSetOf("Sanjeet","Manjeet",3,4)
    //Different ways to create mutable Set
    val  mutableTypeSet:MutableSet<Int> = mutableSetOf(1,3,5,6)
    mutableTypeSet.add(4)
    mutableTypeSet.remove(3)
    val  mutableTypeSet1:MutableSet<Int> = mutableSetOf()
    mutableTypeSet1.add(9)
    mutableTypeSet1.add(6)
    println("Set size is ${mutableSet.size}")
    mutableSet.add("Ram ji")
    mutableSet.add("Krishna")
    mutableSet.add("Rajveer")
    println("Set size is ${mutableSet.size}")
    mutableSet.forEach { value -> println("Value of Set is $value") }


    println("=============================================================================================")

    //Example of Mutable Map
    val mutableMap = mutableMapOf(1 to "Sanjeet", 2 to "Monika", 3 to "Suryansh", "Suryansh" to "Beta", "Sanjeet" to "Bap")
    mutableMap.forEach { key, value -> println("First Map key is $key And First Map value is $value ") }

    //Different ways to create mutable Set
    val mutableTypeMap:Map<String,Int> = mutableMapOf("S" to 1, "M" to 2, "Narayan" to 4)
    for (item in mutableTypeMap){
        println("Second Mutable Map key is ${item.key} And First Map value is ${item.value} ")
    }

    //Another Different ways to create mutable Set
    val anotherMutableTypeMap = mutableMapOf<Int,Int>(1 to 1, 2 to 2, 3 to 3)
    anotherMutableTypeMap.put(4 , 5)
    anotherMutableTypeMap.put(5,7)
    anotherMutableTypeMap.remove(1)
    for (item in mutableTypeMap){
        println("Second Mutable Map key is ${item.key} And First Map value is ${item.value} ")
    }


}