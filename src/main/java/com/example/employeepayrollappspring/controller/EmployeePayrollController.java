package com.example.employeepayrollappspring.controller;

import com.example.employeepayrollappspring.model.Employee;
import com.example.employeepayrollappspring.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;

@RestController
public class EmployeePayrollController {
    public static final String template = "Hello & Welcome to the Employee Payroll App, %s";

    @Autowired
    private IEmployeePayrollService employeePayrollService;


    @RequestMapping("/welcome")
    public String welcomeMessage(){
        return employeePayrollService.sayWelcome();
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeePayrollService.saveEmployee(employee);
    }

    @GetMapping("/findEmpById/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeePayrollService.findEmployeeById(id);
    }

    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployee(){
        return employeePayrollService.allEmployee();
    }

    @PutMapping("/editEmployee/{id}")
    public Employee editEmployeeById(@RequestBody Employee employee, @PathVariable Integer id){
        return employeePayrollService.editEmployee(employee, id);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeId(@PathVariable Integer id){
        employeePayrollService.deleteEmployee(id);
        return "Data Deleted";
    }
}