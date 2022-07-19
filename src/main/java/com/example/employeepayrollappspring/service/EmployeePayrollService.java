package com.example.employeepayrollappspring.service;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import com.example.employeepayrollappspring.exceptionHandling.EmployeePayrollException;
import com.example.employeepayrollappspring.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> getEmployeeData() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeDataById(int id) {
        return employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
    }

    @Override
    public Employee createEmployeeData(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(employeeList.size()+1, employeeDTO);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployeeData(int id, EmployeeDTO employeeDTO) {
        Employee employee = this.getEmployeeDataById(id);
        employee.setFirstName(employeeDTO.firstName);
        employee.setLastName(employeeDTO.lastName);
        employee.setDepartment(employeeDTO.department);
        employee.setSalary(employeeDTO.salary);
        employeeList.set(id-1, employee);
        return employee;
    }

    @Override
    public void deleteEmployeeData(int id) {
        employeeList.remove(id-1);
    }
}