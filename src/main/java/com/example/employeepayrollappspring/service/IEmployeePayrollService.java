package com.example.employeepayrollappspring.service;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import com.example.employeepayrollappspring.model.Employee;

import java.util.List;

public interface IEmployeePayrollService {

    List<Employee> getEmployeeData();

    Employee getEmployeeDataById(int empId);

    Employee createEmployeeData(EmployeeDTO employeeDTO);

    Employee updateEmployeeData(int empId, EmployeeDTO empPayrollDTO);

    void deleteEmployeeData(int empId);
}
