package com.junit.junitlearning.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = EmployeeController.class)
class EmployeeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getEmployeeNameTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/getemployeename"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Jacob"));
    }

    @Test
    void getEmployeeJsonTest() throws Exception {
        Employee employee = new Employee(1, "Amit Ghosh");
        mockMvc.perform(MockMvcRequestBuilders.get("/api/getemployeejson"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(objectMapper.writeValueAsString(employee)));
    }

    @Test
    void getEmployeeWithParamTest() throws Exception {
        Employee employee = new Employee(1, "Amit");
        mockMvc.perform(MockMvcRequestBuilders.get("/api/getemployeewithparam")
                        .param("id", "1").param("name", "Amit"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(objectMapper.writeValueAsString(employee)));
    }
}