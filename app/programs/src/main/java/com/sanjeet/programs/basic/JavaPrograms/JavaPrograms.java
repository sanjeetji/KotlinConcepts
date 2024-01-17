package com.sanjeet.programs.basic.JavaPrograms;

import android.widget.Toast;

public class JavaPrograms {

    public static void main(String[] args) {
        System.out.println("Hello Java world !");
//        checkingInstanceObj();
//        ifElseIfAsExpression();
    }

    private static void ifElseIfAsExpression() {
        int a = 76;
        int b = 54;

        System.out.println("Large no is : ");
    }


    public static void checkingInstanceObj(){
        Object name = "Sanjeet Kumar";
        if (name instanceof Integer){
            System.out.println("name is instance of Integer");
        } else if (name instanceof Double) {
            System.out.println("name is instance of Double");
        } else if (name instanceof String) {
            System.out.println("name is instance of String");
        }
    }
}
