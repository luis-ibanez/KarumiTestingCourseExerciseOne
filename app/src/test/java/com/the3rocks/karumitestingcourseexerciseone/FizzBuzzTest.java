package com.the3rocks.karumitestingcourseexerciseone;


import com.the3rocks.karumitestingcourseexerciseone.ui.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    public static final int ONLY_MULTIPLE_OF_THREE = 3;
    public static final int ONLY_MULTIPLE_OF_FIVE = 5;
    public static final int MULTIPLE_OF_THREE_AND_FIVE = 15;

    @Test
    public void Maxint_returns_maxint() throws Exception {
        assertEquals(String.valueOf(Integer.MAX_VALUE), FizzBuzz.fizzBuzz(Integer.MAX_VALUE));
    }

    @Test
    public void zero_returns_fizzbuzz() throws Exception {
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(0));
    }

    @Test
    public void multiple_of_three_returns_fizz() throws Exception {
        assertEquals("fizz", FizzBuzz.fizzBuzz(ONLY_MULTIPLE_OF_THREE));
    }

    @Test
    public void multiple_of_five_returns_buzz() throws Exception {
        assertEquals("buzz", FizzBuzz.fizzBuzz(ONLY_MULTIPLE_OF_FIVE));
    }

    @Test
    public void multiple_of_three_and_five_returns_fizzbuzz() throws Exception {
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(MULTIPLE_OF_THREE_AND_FIVE));
    }
}
