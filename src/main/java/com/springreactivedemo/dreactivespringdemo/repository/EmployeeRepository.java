package com.springreactivedemo.dreactivespringdemo.repository;

import com.springreactivedemo.dreactivespringdemo.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee,String> {
}
