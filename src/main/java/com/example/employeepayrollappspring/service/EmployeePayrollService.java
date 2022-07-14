package com.example.employeepayrollappspring.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    @Override
    public String sayWelcome() {
        return "Hello World!!!";
    }
}
