package com.sanjeet.programs.basic.KotlinProgram


fun main() {
    var name:String = "Sanjeet Kumar Parjapati"
    String().addSomeCharIntoString(name)
//    String().findDuplicateCharInString(data1)
    name = "Rajeev Kumar"
    String().addSomeCharIntoString(name)

}

val String.data: String
    get() = "Sanjeet ji"

fun String.addSomeCharIntoString(data:String){
    println("Formatted String is ======================= for ${String().data}")
    println("==========$data=================")
}

var data1:String = "My Name is sanjeet kumar jiiiiiii"
fun String.findDuplicateCharInString(data: String){
    for (char in data){
        var str1:String= ""
        var charCount:Int = 0
        for (char1 in data){
            if (char.equals(char1)){
                charCount++
                if (charCount>0){
                    str1 = char1.toString()
                }
            }
        }
        if (charCount>1){
          println("Duplicate char is $str1 and count is $charCount")
        }
    }

}
