package com.example.employeepayrollappspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication
                                    .run(EmployeePayrollAppSpringApplication.class, args);
        System.out.println("Welcome to Employee Payroll App.");
        log.info("Employee Payroll App Started in {} Environment.",
                            context.getEnvironment().getProperty("environment"));
    }
}
