package com.example.employeepayrollappspring.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@RequiredArgsConstructor
public class EmployeeDTO {

    @NotEmpty(message="Employee first name cannot null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee first name is invalid")
    public String firstName;
    @NotEmpty(message="Employee last name cannot null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee last name is invalid")
    public String lastName;
    public String department;
    @Min(value = 5000, message = "Minimum salary should be more than 5000")
    public long salary;

    public EmployeeDTO(String firstName, String lastName, String department, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
}
