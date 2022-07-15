package com.example.employeepayrollappspring.service;

import com.example.employeepayrollappspring.model.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    String sayWelcome();

    Employee saveEmployee(Employee employee);

    Employee findEmployeeById(Integer id);

    List<Employee> allEmployee();

    Employee editEmployee(Employee employee, Integer id);

    void deleteEmployee(Integer id);
}
