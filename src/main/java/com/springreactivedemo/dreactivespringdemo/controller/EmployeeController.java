package com.springreactivedemo.dreactivespringdemo.controller;

import com.springreactivedemo.dreactivespringdemo.model.Employee;
import com.springreactivedemo.dreactivespringdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmp")
    public Mono<Employee> saveEmployee(@RequestBody Employee employee){
        Mono<Employee> emp=employeeRepository.save(employee);
        return emp;
    }

    @GetMapping("/getEmployees")
    public Flux<Employee> fetchEmployees(){
        return employeeRepository.findAll();
    }

}
