package com.example.employeepayrollappspring.service;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import com.example.employeepayrollappspring.model.Employee;

import java.util.List;

public interface IEmployeePayrollService {

    List<Employee> getEmployeeData();

    Employee getEmployeeDataById(int id);

    Employee createEmployeeData(EmployeeDTO employeeDTO);

    Employee updateEmployeeData(int id, EmployeeDTO empPayrollDTO);

    void deleteEmployeeData(int id);
}
