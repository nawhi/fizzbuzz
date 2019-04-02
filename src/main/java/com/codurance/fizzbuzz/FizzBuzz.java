package com.codurance.fizzbuzz;

class FizzBuzz {
    String convert(int number) {
        String words = "";

        if (multipleOf(3, number)) words += "Fizz";
        if (multipleOf(5, number)) words += "Buzz";

        if (words.isEmpty())
            return String.valueOf(number);
        return words;
    }

    private boolean multipleOf(int factor, int number) {
        return number % factor == 0;
    }

}
