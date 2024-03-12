package com.example.backend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FizzBuzzServiceTest {
    @Mock
    private ResultsRepo resultsRepo;

    @InjectMocks
    private FizzBuzzService fizzBuzzService = new FizzBuzzService(resultsRepo);
    @Test
    void shouldBeFizzThree() {
        assertEquals("Fizz", fizzBuzzService.fizzBuzz(3));
    }

    @Test
    void shouldBeFizzNegativeThree() {
        //FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Fizz", fizzBuzzService.fizzBuzz(-3));
    }

    @Test
    void shouldBeBuzzFive() {
        //FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Buzz", fizzBuzzService.fizzBuzz(5));
    }

    @Test
    void shouldBeBuzzNegativeFive() {
        //FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("Buzz", fizzBuzzService.fizzBuzz(-5));
    }

    @Test
    void shouldBeFizzBuzzFifteen() {
        //FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("FizzBuzz", fizzBuzzService.fizzBuzz(15));
    }

    @Test
    void shouldBeFizzBuzzNegativeFifteen() {
        //FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("FizzBuzz", fizzBuzzService.fizzBuzz(-15));
    }

    @Test
    void shouldBeFizzBuzzZero() {
        //FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("FizzBuzz", fizzBuzzService.fizzBuzz(0));
    }

    @Test
    void shouldBeStringFour() {
        //FizzBuzzService fizzBuzzService = new FizzBuzzService();
        assertEquals("4", fizzBuzzService.fizzBuzz(4));
    }
}