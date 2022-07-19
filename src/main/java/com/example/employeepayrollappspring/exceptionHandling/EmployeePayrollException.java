package com.example.employeepayrollappspring.exceptionHandling;

public class EmployeePayrollException extends RuntimeException{

    public EmployeePayrollException(String message){
        super(message);
    }
}
