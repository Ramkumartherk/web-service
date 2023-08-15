package com.task.callerservice.service;

import com.task.callerservice.dto.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public EmployeeResponse getEmployees() {
        String url = "https://dummy.restapiexample.com/api/v1/employees";
        EmployeeResponse employeeResponse = restTemplate.getForObject(url, EmployeeResponse.class);
        return employeeResponse;
    }
}
