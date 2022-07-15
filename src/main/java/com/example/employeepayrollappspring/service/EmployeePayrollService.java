package com.example.employeepayrollappspring.service;

import com.example.employeepayrollappspring.model.Employee;
import com.example.employeepayrollappspring.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    @Autowired
    private EmployeePayrollRepository repository;

    @Override
    public String sayWelcome() {
        return "Hello World!!!";
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> allEmployee() {
        return repository.findAll();
    }

    @Override
    public Employee editEmployee(Employee employee, Integer id) {
        Employee existingEmployee =repository.findById(id).orElse(null);
        if (existingEmployee != null){
            existingEmployee.setFirstName(employee.getFirstName());
            existingEmployee.setLastName(employee.getLastName());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setSalary(employee.getSalary());
            return repository.save(existingEmployee);
        }else
            return null;
    }

    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
