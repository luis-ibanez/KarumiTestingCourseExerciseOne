package com.the3rocks.karumitestingcourseexerciseone.ui;


public class FizzBuzz {

    public static String fizzBuzz(int number){
        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0){
            stringBuilder.append("fizz");
        }

        if (number % 5 == 0){
            stringBuilder.append("buzz");
        }

        return stringBuilder.length() > 0 ? stringBuilder.toString() : String.valueOf(number);
    }
}
