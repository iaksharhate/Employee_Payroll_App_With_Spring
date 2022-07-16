package com.example.employeepayrollappspring.dto;

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

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
