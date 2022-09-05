package com.junit.junitlearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EmployeeController {

    @GetMapping("/getemployeename")
    public String getEmployeeName() {
        return "Jacob";
    }

    @GetMapping("/getemployeejson")
    public Employee getEmployeeJson() {
        return new Employee(1, "Amit Ghosh");
    }

    @GetMapping("/getemployeewithparam")
    public Employee getEmployeeWithParam(@RequestParam Integer id, @RequestParam String name) {
        return new Employee(id, name);
    }
}
