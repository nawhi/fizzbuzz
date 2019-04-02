package com.codurance.fizzbuzz;

class FizzBuzz {
    String convert(int number) {
        if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
