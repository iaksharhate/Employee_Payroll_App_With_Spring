package com.example.employeepayrollappspring.service;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import com.example.employeepayrollappspring.model.Employee;
import com.example.employeepayrollappspring.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    @Override
    public List<Employee> getEmployeeData() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, new EmployeeDTO("Akshar", "Hate","HR",30000)));
        return employeeList;
    }

    @Override
    public Employee getEmployeeDataById(int empId) {
        Employee employee = null;
        employee = new Employee(1, new EmployeeDTO("Yogesh", "More","PD",35000));
        return employee;
    }

    @Override
    public Employee createEmployeeData(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1, employeeDTO);
        return employee;
    }

    @Override
    public Employee updateEmployeeData(int empId, EmployeeDTO empPayrollDTO) {
        Employee employee = null;
        employee = new Employee(1, empPayrollDTO);
        return employee;
    }

    @Override
    public void deleteEmployeeData(int empId) {

    }
}