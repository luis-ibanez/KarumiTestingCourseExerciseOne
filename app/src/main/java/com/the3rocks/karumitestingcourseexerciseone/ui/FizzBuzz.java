package com.the3rocks.karumitestingcourseexerciseone.ui;


public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public static String fizzBuzz(int number){
        StringBuilder stringBuilder = new StringBuilder();

        if (number % 3 == 0){
            stringBuilder.append(FIZZ);
        }

        if (number % 5 == 0){
            stringBuilder.append(BUZZ);
        }

        return stringBuilder.length() > 0 ? stringBuilder.toString() : String.valueOf(number);
    }
}
