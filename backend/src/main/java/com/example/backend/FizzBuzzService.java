package com.example.backend;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public static String fizzBuzz(int value){
        if(value % 3 == 0){
            if(value % 5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(value);
        }
    }
}
