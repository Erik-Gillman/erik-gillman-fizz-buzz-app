package com.example.backend;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(FizzBuzzController.class)
class FizzBuzzControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FizzBuzzService service;

    @Test
    void getFizzBuzzShouldReturnOk() throws Exception {
        this.mockMvc.perform(get("/4")).andExpect(status().isOk())
                .andExpect(content().json("4"));
    }

    @Test
    void getFizzBuzzShouldReturnError() throws Exception {
        this.mockMvc.perform(get("/testing")).andExpect(status().isBadRequest());
    }

}