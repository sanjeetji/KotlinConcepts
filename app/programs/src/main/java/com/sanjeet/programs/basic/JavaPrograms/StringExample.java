package com.sanjeet.programs.basic.JavaPrograms;

public class StringExample {

    public static void main(String[] args) {
        reverseString();
    }

    private static void reverseString(){
        String name = "Sanjeet Kumar";
        for (int i =name.length()-1;i<name.length();i--){
            System.out.println(i);
        }
    }
}
