package com.example.employeepayrollappspring.model;

import com.example.employeepayrollappspring.dto.EmployeeDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private long salary;

    public Employee() {

    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee(int id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.firstName = employeeDTO.firstName;
        this.lastName = employeeDTO.lastName;
        this.department = employeeDTO.department;
        this.salary = employeeDTO.salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}
