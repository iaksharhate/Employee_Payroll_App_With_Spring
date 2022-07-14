package com.example.employeepayrollappspring.controller;

import com.example.employeepayrollappspring.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollController {
    public static final String template = "Hello & Welcome to the Employee Payroll App, %s";

    @Autowired
    private IEmployeePayrollService employeePayrollService;


    @RequestMapping("/welcome")
    public String welcomeMessage(){
        return employeePayrollService.sayWelcome();
    }
}
