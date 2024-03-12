package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultsRepo extends JpaRepository<Results, Integer> {
    public Results findResultsByValue(Integer value);
}
