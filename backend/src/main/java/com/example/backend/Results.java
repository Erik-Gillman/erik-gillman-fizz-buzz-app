package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Results {
    @Id
    private Integer value;

    private String fizzBuzz;

    Results(Integer value, String fizzBuzz){
        this.value = value;
        this.fizzBuzz = fizzBuzz;
    }

    public Results() {

    }

    public int getValue() {
        return value;
    }

    public String getFizzBuzz() {
        return fizzBuzz;
    }
}
