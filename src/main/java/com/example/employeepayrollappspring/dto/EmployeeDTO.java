package com.example.employeepayrollappspring.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmployeeDTO {

    public String firstName;
    public String lastName;
    public String department;
    public long salary;

    public EmployeeDTO(String firstName, String lastName, String department, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
}
