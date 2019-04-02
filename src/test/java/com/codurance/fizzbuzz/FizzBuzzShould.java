package com.codurance.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzShould {
    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    void convert_regular_number_to_number_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 6, 9 })
    void convert_multiples_of_3_to_Fizz(int input) {
        assertEquals("Fizz", new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @ValueSource(ints = { 5, 10, 20 })
    void convert_multiples_of_5_to_Buzz(int input) {
        assertEquals("Buzz", new FizzBuzz().convert(input));
    }
}

