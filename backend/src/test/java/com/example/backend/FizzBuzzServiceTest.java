package com.example.backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzServiceTest {
    @Test
    void shouldBeFizzThree() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Fizz", FizzBuzzService.fizzBuzz(3));
    }

    @Test
    void shouldBeFizzNegativeThree() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Fizz", FizzBuzzService.fizzBuzz(-3));
    }

    @Test
    void shouldBeBuzzFive() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Buzz", FizzBuzzService.fizzBuzz(5));
    }

    @Test
    void shouldBeBuzzNegativeFive() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Buzz", FizzBuzzService.fizzBuzz(-5));
    }

    @Test
    void shouldBeFizzBuzzFifteen() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("FizzBuzz", FizzBuzzService.fizzBuzz(15));
    }

    @Test
    void shouldBeFizzBuzzNegativeFifteen() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("FizzBuzz", FizzBuzzService.fizzBuzz(-15));
    }

    @Test
    void shouldBeFizzBuzzZero() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("FizzBuzz", FizzBuzzService.fizzBuzz(0));
    }

    @Test
    void shouldBeStringFour() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("4", FizzBuzzService.fizzBuzz(4));
    }
}