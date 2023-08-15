package com.task.callerservice.controller;

import com.task.callerservice.dto.EmployeeResponse;
import com.task.callerservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<EmployeeResponse> getEmployees() {
        EmployeeResponse employeesResponse = employeeService.getEmployees();
        return new ResponseEntity<>(employeesResponse, HttpStatus.OK);
    }
}
