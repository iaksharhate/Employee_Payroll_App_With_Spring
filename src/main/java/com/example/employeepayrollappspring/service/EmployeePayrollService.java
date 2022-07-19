package com.example.employeepayrollappspring.service;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import com.example.employeepayrollappspring.exceptionHandling.EmployeePayrollException;
import com.example.employeepayrollappspring.model.Employee;
import com.example.employeepayrollappspring.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService{

    @Autowired
    EmployeePayrollRepository repository;

    @Override
    public List<Employee> getEmployeeData() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeDataById(int id) {
        return repository.findById(id)
                         .orElseThrow(() -> new EmployeePayrollException("Employee with ID "+
                                 id +" does not exist."));
    }

    @Override
    public Employee createEmployeeData(EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(employeeDTO);
        return repository.save(employee);
    }

    @Override
    public Employee updateEmployeeData(int id, EmployeeDTO employeeDTO) {
        Employee employee = this.getEmployeeDataById(id);
        employee.updateEmployee(employeeDTO);
        return repository.save(employee);
    }

    @Override
    public void deleteEmployeeData(int id) {
        Employee employee = this.getEmployeeDataById(id);
        repository.delete(employee);
    }
}