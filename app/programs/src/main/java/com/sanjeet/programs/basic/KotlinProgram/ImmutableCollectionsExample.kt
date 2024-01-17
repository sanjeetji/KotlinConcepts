package com.sanjeet.programs.basic.KotlinProgram

//Immutable List, Set, Map Example
fun main() {

    //Immutable List Example
    val immutableList = listOf("First", "Second", 21, 43.3, "Third")
    for (item in immutableList) {
        println("Item of immutable List is $item")
    }

    //ImmutableListType Example
    val immutableTypeList:List<Int> = listOf<Int>(21, 43, 54, 76, 87, 43, 12, 65, 32, 54)
//    val immutableTypeList = listOf(21, 43, 54, 76, 87, 43, 12, 65, 32, 54)
    for (item in immutableTypeList) {
        println("Item of immutable Type List is $item")
        println("Even item of immutable Type List is ${if (item % 2 == 0) item else "Not Even Item"}")
    }

    //Immutable Set Example
    val immutableSet = setOf("Sanjeet", "Manjeet", "Geeta", "Seeta")
    for (item in immutableSet) {
        println("Item is in immutable Set is $item")
    }

    //Immutable Type Set Example
//    val immutableTypeSet = setOf<Int>(1, 2, 3, 4, 5, 6, 6, 7, 0, 1, 8)
    val immutableTypeSet:Set<Int> = setOf(1, 2, 3, 4, 5, 6, 6, 7, 0, 1, 8)
    for (item in immutableTypeSet) {
        println("Item is in immutable Type Set is $item")
    }

    //Immutable Set Example
    val immutableMap = mapOf(1 to "Sanjeet", "Sanju" to 5, 5 to 3)
    for (item in immutableMap) {
        println("Item is in immutable Map key ${item.key} and value is ${item.value}")
    }

    //Immutable Type Set Example
//    val immutableTypeMap = mapOf<Int,String>(1 to "Sanjeet", 2 to "Sanju", 4 to "5", 5 to "Ranjana")
    val immutableTypeMap:Map<Int,String> = mapOf(1 to "Sanjeet", 2 to "Sanju", 4 to "5", 5 to "Ranjana")
    for (item in immutableTypeMap) {
        println("Item is in immutable Type Map key ${item.key} and value is ${item.value}")
    }

}