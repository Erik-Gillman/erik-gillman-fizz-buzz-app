package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    private final ResultsRepo resultsRepo;
    @Autowired FizzBuzzService(ResultsRepo resultsRepo){
        this.resultsRepo = resultsRepo;
    }
    public String fizzBuzz(Integer value){
        Results result = this.findResultsByValue(value);
        if(result != null){
            return result.getFizzBuzz();
        }
        if(value % 3 == 0){
            if(value % 5 == 0){
                Results newResults = new Results(value, "FizzBuzz");
                resultsRepo.save(newResults);
                return "FizzBuzz";
            }
            Results newResults = new Results(value, "Fizz");
            resultsRepo.save(newResults);
            return "Fizz";
        } else if (value % 5 == 0) {
            Results newResults = new Results(value, "Buzz");
            resultsRepo.save(newResults);
            return "Buzz";
        }
        else {
            Results newResults = new Results(value, value.toString());
            resultsRepo.save(newResults);
            return Integer.toString(value);
        }
    }
    public Results findResultsByValue(Integer value){
        return resultsRepo.findResultsByValue(value);
    }
}
