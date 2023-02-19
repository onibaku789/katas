package org.example;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        if (0 >= number) {
            throw new RuntimeException();
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
