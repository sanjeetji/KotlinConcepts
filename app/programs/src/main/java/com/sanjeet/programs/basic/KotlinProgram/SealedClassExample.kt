package com.sanjeet.programs.basic.KotlinProgram

/**
 * Sealed class is a class which restricts the class hierarchy.
 * Sealed class is declare used to sealed keyword.
 * Sealed class is an abstract class which can not be initiated.
 * Means obj cannot be created. Obj can be created of its child class.
 * All child class of the sealed class are defined within itself or with in the same file.
 * OR Sealed classes are used to representing the restricted hierarchies of the class,
 * When a value can have one of the type from limited set, But can not have any other type.
 */
sealed class SealedClassExample {

    data class Success(val result: String) : SealedClassExample()
    class Error(val errorMessage: String) : SealedClassExample()
    object Loading : SealedClassExample()
}

fun main() {
    var successObj = SealedClassExample.Success("Success")
    var errorObj = SealedClassExample.Error("API Error")
    var loadingObj = SealedClassExample.Loading

    checkType(loadingObj)
}

fun checkType(obj: SealedClassExample) {
    when (obj) {
        is SealedClassExample.Success -> println("Result is Success")
        is SealedClassExample.Error -> println("Result is getting error")
        SealedClassExample.Loading -> println("Result is Progress")

        else -> {}
    }
}
