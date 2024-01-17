package com.sanjeet.programs.basic.KotlinProgram

fun main() {
    val methodOverLoadingExample:MethodOverLoadingExample = MethodOverLoadingExample();
    methodOverLoadingExample.studentBio("Sanjeet",25,6594)
    methodOverLoadingExample.studentAdd()
    methodOverLoadingExample.studentCollege("IIMT","BCA",1294)
}

class MethodOverLoadingExample {

    fun studentBio(name:String,age:Int,rollNo:Int){
        println("Student Name is $name")
        println("Student age is $age")
        println("Student roll no is $rollNo")
    }
    fun studentAdd(){
        println("Student village is Papsra Khadar")
        println("Student post is Negliya Mev")
        println("Student pin code is 244235")
    }
    fun studentCollege(collegeName:String, course:String, collegeCode:Int){
        println("Student collage name is $collegeName")
        println("Student branch name is $course")
        println("Student college code is $collegeCode")
    }
}