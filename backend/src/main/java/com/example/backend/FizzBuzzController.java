package com.example.backend;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "FizzBuzz")
public class FizzBuzzController {
    private final FizzBuzzService fizzBuzzService;

    FizzBuzzController(FizzBuzzService fizzBuzzService){
        this.fizzBuzzService = fizzBuzzService;
    }

    @Operation(
            description = "Determine FizzBuzz",
            summary = "Calls service to determine number's fizzbuzz",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Not integer",
                            responseCode = "400"
                    )
    }
    )
    @GetMapping("/{value}")
    public ResponseEntity<String> getFizzBuzz(@PathVariable("value") Integer value){
        /*int convertValue;
        try{
            convertValue = Integer.parseInt(value);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }*/
        return new ResponseEntity<>(fizzBuzzService.fizzBuzz(value), HttpStatus.OK);
    }

}
