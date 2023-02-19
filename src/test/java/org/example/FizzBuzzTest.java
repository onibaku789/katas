package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void givenZeroFizzBuzzShouldThrowAnException() {
        Assertions.assertThatCode(() -> fizzBuzz.fizzBuzz(0))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void givenFourFizzBuzzShouldReturnFour() {
        Assertions.assertThat(fizzBuzz.fizzBuzz(4)).isEqualTo("4");
    }

    @Test
    void givenThreeFizzBuzzShouldReturnFizz() {
        Assertions.assertThat(fizzBuzz.fizzBuzz(3)).isEqualTo("fizz");
    }

    @Test
    void givenFiveFizzBuzzShouldReturnBuzz() {
        Assertions.assertThat(fizzBuzz.fizzBuzz(5)).isEqualTo("buzz");
    }

    @Test
    void givenTwentyFizzBuzzShouldReturnBuzz() {
        Assertions.assertThat(fizzBuzz.fizzBuzz(20)).isEqualTo("buzz");
    }

    @Test
    void givenFifteenFizzBuzzShouldReturnFizzBuzz() {
        Assertions.assertThat(fizzBuzz.fizzBuzz(15)).isEqualTo("fizzbuzz");
    }

    @Test
    void givenOneHundredAndFiftyFizzBuzzShouldReturnFizzBuzz() {
        Assertions.assertThat(fizzBuzz.fizzBuzz(150)).isEqualTo("fizzbuzz");
    }

    @Test
    void givenMinusOneFizzBuzzShouldThrownAnException() {
        Assertions.assertThatCode(() -> fizzBuzz.fizzBuzz(-1))
                .isInstanceOf(RuntimeException.class);
    }
}