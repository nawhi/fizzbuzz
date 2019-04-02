package com.codurance.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzShould {
    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    void convert_regular_number_to_number_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({ "3,Fizz", "6,Fizz", "9,Fizz" })
    void convert_multiples_of_3_to_Fizz(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }
}

