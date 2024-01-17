package com.sanjeet.programs.basic.KotlinProgram

import java.util.Scanner

fun main() {
    println("Hello Sanjeet kumar ! \nAddition is : ${addTwoNo(5, 6)}")
//    higherOrderFun(21, 54, lambda)
//    error()
//    nullSafetyExample()
//    typeConversion()
//    ifExpressionFun()
//    whenExpression()
//    forLoop()
//    whileLoop()
//    doWhileLoop()
//    breakStatement()
//    continueStatement()
//    arrayFunction()
//    stringFunction()
//    everyVariableIsNonNull();
//    higherOrderFunctionExample();
//    ifElseIfAsExpression()
//    defaultArgument();
//    namedArgument()
//    lambdaFunction()
//    highLevelFun(name1,age1,add2No(age1,age1))
//    higherOrderFunWithLambda()

}

fun higherOrderFunWithLambda() {
    var age = 21;
    var gender = "Male"
    exampleOfHighLevelFun(age,gender,{a:Int,b:Int->a+b})
}

fun exampleOfHighLevelFun(age: Int, gender: String, function: (Int, Int) -> Int) {
    println("Student Age is $age")
    println("Student gender is $gender")
    println("Addition is ${function(21,43)}")
}

fun lambdaFunction() {
    val addition = {a:Int,b:Int->a+b}
    println("Addition is : ${addition(2,4)}")

    //Case 1
    var lambda = {name :String -> println("Good Morning $name") }
    lambda("Sanjeet")

    //Case 2
    var lambdaMultiLine = {a:Int , b:Int ->
        println("Addition of 2 no is ${a+b}")
    }
    lambdaMultiLine(43,654)

    //Case 3
    var lambdaMultiWithType :(Int ,String)->Int = {a,b ->
        println("Student age is $a")
        println("Student name is $b")
        2
    }

    lambdaMultiWithType(32,"Sanjeet")
}

fun namedArgument() {
    student()
}

fun student() {
    callingNamedArgumentFun()//Success
//    callingNamedArgumentFun("Mohan",18)// will give the error at compile time //The integer literal does not conform to the expected type String
    callingNamedArgumentFun("Sanjeet", roll = 24)//Success
}

fun callingNamedArgumentFun(name:String = "Mohan",gender:String="Male",roll:Int=20) {
    println("Name is $name")
    println("Gender is $gender")
    println("Roll no is $roll")
}


/**
 * Default argument is used to provide default value to a function parameter.
 * That means if the parameter is not explicitly passed in when function is called.
 * It will use the default value.
 */
fun defaultArgument() {
    println("Default Parameter function example .......")
    greeting("Mohan")
}

fun greeting(userName:String = "Sanjeet Kumar") {
    println("Good Morning $userName")
}

fun ifElseIfAsExpression() {
    val a = 5;
    val b= 6;
    val result = if (a>b){
        a
    }else{
        b
    }

    println("Large no is : $result")
}

/**
 * A Higher Order function is a function which can accept the function
 * as a parameter or return a function or can do both.
 * HigherOrder function example passing a simple function as a argument
 */

fun add2No(a:Int,b:Int):Int{
    return a+b;
}

var name1 :String = "Sanjeet";
var age1:Int = 42;


fun highLevelFun(name1: String, age1: Int, resultOfAdd2No: Int) {
    println("User name is $name1")
    println("User age is $age1")
    println("User result is $resultOfAdd2No")
}


fun higherOrderFunctionExample() {
    val result : Int = additionOfThreeNo(5,8, additionOfTwoNo(2,5))
    println("Higher Order Function Result is : $result")
}
fun additionOfThreeNo(a:Int, b:Int, c:Int):Int{
    val addition : Int = a+b+c;
    return addition;
}
fun additionOfTwoNo(a:Int,b:Int):Int{
    val c= a+b;
    return c;
}

/**
 * In Kotlin every variable is as Non-Null variable.
 * So we can not assign null value directly to the variable.
 * To assign a null value we need to declare a variable as nullable with the help of ?.
 * Other wise it'll give the compile time error.
 */
fun everyVariableIsNonNull() {
    var name : String? = "Sanjeet";
    println(name)
    name = null;
    println("Name length is ${name?.length}")
    var gender:String = "Male"
    println("Gender length is ${gender.length}")
}

fun stringFunction() {
    //Escaped String
    val escapedString = "Hello Sanjeet kumar ! \n"
    println("Escaped string is $escapedString")

    //Row String
    val rowString = """This is row string     
        With multiple lines withing any escaped
                characters
    """.trimMargin()

    println("Row string is $rowString")

    val value = "Hello_Sanjeet_Kumar"

    //Access String using index
    println("Access String character using static index is ${value[2]}")


    //Access String using get function
    println("Access String using get function is ${value.get(4)}")

    //Access String using iterating
    for (i in value.indices){
        println("Access String using loop at $i index value is ${value[i]}")
    }

    // As per the official documentation, "==" is used for structural equality. Means check that value should be equal of both var
    // As per the official documentation, "===" is used for referential equality. Means check that object should be same on both var
    val v1 = "Hello Sanjeet"
    val v2 = "Hello Sanjeet"
    val v3 = "Hello Sanjeet Kumar"
    val v4 = v1

    println(v1 === v2)
    println(v1 == v2)
    println(v1 == v3)
    println(v1 === v3)
    println(v1 === v4)
    println(v1 == v4)

    println("")
    println("")

    val s1 = 3
    val s2 = 3
    val s3 = 5
    val s4 = s1
    println(s1 == s2)
    println(s1 === s2)
    println(s1 === s4)


}

fun arrayFunction() {

    //Creating array using arrayOf() function
    val num = arrayOf<Int>(1,3,5,6,7,8)
    for (i in 0..num.size-1){
        println("Value of i is : ${num[i]}")
    }
    for (i in num){
        println("Value of i using array is $i")
    }

    //Creating array using Array constructor
    val number = Array(5,{i->i*1})
    for (i in number){
        println("Value of i using number is $i")
    }

    val name = arrayOf("Sanjeet","Manjeet","Ranjeet","Saranjeet")
    for (i in name){
        println("Original name of array : $i")
    }
    //set(index,value) function
    name.set(1,"Ravi")

    for (i in name){
        println("After modifying name of array : $i")
    }
    //get(index) function

    println(name.get(1))

}

fun continueStatement() {
    for (i in 1..10) {
        if (i == 4) {
            continue
        }
        println(i)
    }
}

fun breakStatement() {
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
}

fun doWhileLoop() {
    var number = 0;
    do {
        println("Do-While value is $number")
        number++
    } while (number < 4)
}

fun whileLoop() {

    var number = 1
    while (number <= 10) {
        println("Value using while loop is $number")
        number++
    }

    //infinite while loop
    while (true) {
        println("While infinite loop running")
    }
}

fun forLoop() {

    //Simple range for loop
    for (i in 1..10) {
        println("Value is $i")
    }

    //range for loop with step 3
    for (i in 1..15 step 3) {
        println("Step with 3 value is $i")
    }

    // for loop with array
    val array = arrayOf(1, 2, 4, 6, 8, 6, 10, 54, 7)
    for (i in array) {
        println("Value of array $i")
    }

    //for loop with array with indices
    for (i in array.indices) {
        println("Value of array at indices $i is ${array[i]}")
    }

    val list = listOf(1, 3, 5, 8, "Meerut", "Kanpur", "Delhi")
    //for loop with list
    for (i in list) {
        println("Value of list $i")
    }

    //for loop with list with index and value with library function withIndex()
    for ((index, value) in list.withIndex()) {
        println("Value of list at $index is $value")
    }
}

fun whenExpression() {
    val scanner = Scanner(System.`in`)

    println("Enter day no : ")
    var number: Int = scanner.next().toInt()

    //When as a statement
    when (number) {
        1 -> println("Day is Sunday")
        2 -> println("Day is Monday")
        3 -> println("Day is Tuesday")
        4 -> println("Day is Wednesday")
        5 -> println("Day is Thursday")
        6 -> println("Day is Friday")
        7 -> println("Day is Saturday")
        else -> println("Enter day no between 1 to 7")
    }

    println("Enter Month no : ")
    number = scanner.next().toInt()
    //When as a expression
    val monthResult: String = when (number) {
        1 -> {
            "Month $number is Jan"
        }

        2 -> {
            "Month $number is Feb"
        }

        3 -> {
            "Month $number is March"
        }

        4 -> {
            "Month $number is April"
        }

        5 -> {
            "Month $number is May"
        }

        6 -> {
            "Month $number is June"
        }

        7 -> {
            "Month $number is July"
        }

        8 -> {
            "Month $number is August"
        }

        9 -> {
            "Month $number is Sept"
        }

        10 -> {
            "Month $number is Oct"
        }

        11 -> {
            "Month $number is Nov"
        }

        12 -> {
            "Month $number is Dec"
        }

        else -> {
            "Enter month no between 1 to 12 your entered month is $number"
        }
    }
    println(monthResult)
}

fun ifExpressionFun() {

    val scanner: Scanner = Scanner(System.`in`)
    println("Enter First no : ")
    var number1 = scanner.next().toInt()
    println("Enter Second no : ")
    var number2 = scanner.next().toInt()

    if (number1 > number2) {
        println("Max no 1 is $number1")
    } else {
        println("Max no 2 is $number2")
    }

    println("Enter First no : ")
    number1 = scanner.next().toInt()
    println("Enter Second no : ")
    number2 = scanner.next().toInt()


    val max = if (number2 > number1) {
        println("Max no b is : ")
        number2
    } else {
        println("Max no a is : ")
        number1
    }

    println(max)

    println("Enter your city : ")
    val cityName: String = scanner.next().toString()

    if (cityName.equals("Meerut")) {
        println("Your entered city is : $cityName")
    } else if (cityName.equals("Delhi")) {
        println("Your entered city is : $cityName")
    } else if (cityName.equals("Agra")) {
        println("Your entered city is : $cityName")
    } else if (cityName.equals("Kanpur")) {
        println("Your entered city is : $cityName")
    } else {
        println("Please enter correct city")
    }


}

fun typeConversion() {

    val v1: Int = 32
    val v2: Long = 12L

    val v3: Int = v2.toInt()
    val v4: Long = v1.toLong()

    println("Larger to smaller $v3")
    println("Smaller to larger $v4")

    val name: String = "Sanjeet"
    val value1: String = "32"
    val value2: Int = value1.toInt()
    println("Value2 is $value2")
//    val value:Int = name.toInt()
//    println("Value is $value")
}

fun nullSafetyExample() {
    var name: String = "sanjeet"
    var city: String? = "Five"
    println("Name is $name")
    println("City is $city")
//    name = null //Null can not be a value of a non-null type String
    city = null
    println("Name is $name")
    println("City is $city")
}

fun error(): Nothing {
    throw IllegalStateException("An error occurred.")
}

fun addTwoNo(a: Int, b: Int): Int {
    return a + b
}

var lambda = { a: Int, b: Int -> a + b }

fun higherOrderFun(a: Int, b: Int, lambdafun: (Int, Int) -> Int) {
    val result = lambdafun(86, 67)
    println("A is $a B is $b And Higher Order function result is $result")
}