package com.example.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Results {
    @Id
    private Integer value;

    private String valueResult;

    Results(Integer value, String valueResult){
        this.value = value;
        this.valueResult = valueResult;
    }

    public Results() {

    }

    public int getValue() {
        return value;
    }

    public String getValueResult() {
        return valueResult;
    }
}
