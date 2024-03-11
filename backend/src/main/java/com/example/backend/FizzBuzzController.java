package com.example.backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    FizzBuzzController(FizzBuzzService fizzBuzzService){
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping("/{value}")
    public ResponseEntity<String> getFizzBuzz(@PathVariable("value") String value){
        int convertValue;
        try{
            convertValue = Integer.parseInt(value);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(fizzBuzzService.fizzBuzz(convertValue), HttpStatus.OK);
    }

}
