package com.example.employeepayrollappspring.controller;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import com.example.employeepayrollappspring.dto.ResponseDTO;
import com.example.employeepayrollappspring.model.Employee;
import com.example.employeepayrollappspring.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getEmployeeData() {
        List<Employee> employeePayrollData = null;
        employeePayrollData = employeePayrollService.getEmployeeData();
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable(value = "id") int id) {
        Employee employee = null;
        employee = employeePayrollService.getEmployeeDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id successful ", employee);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeeData(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = employeePayrollService.createEmployeeData(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created employee Payroll data successfully", employee);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeeData(@PathVariable Integer id,
                                                                 @RequestBody EmployeeDTO empPayrollDTO) {
        Employee employee = null;
        employee = employeePayrollService.updateEmployeeData(id, empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated employee Payroll data successfully", employee);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable("id") Integer id) {
        employeePayrollService.deleteEmployeeData(id);
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully", "Deleted id: " + id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

//    public static final String template = "Hello & Welcome to the Employee Payroll App, %s";
//    @Autowired
//    private IEmployeePayrollService employeePayrollService;

//    @RequestMapping("/welcome")
//    public String welcomeMessage(){
//        return employeePayrollService.sayWelcome();
//    }
//
//    @PostMapping("/addEmployee")
//    public Employee addEmployee(@RequestBody Employee employee){
//        return employeePayrollService.saveEmployee(employee);
//    }
//
//    @GetMapping("/findEmpById/{id}")
//    public Employee getEmployeeById(@PathVariable Integer id){
//        return employeePayrollService.findEmployeeById(id);
//    }
//
//    @GetMapping("/allEmployee")
//    public List<Employee> getAllEmployee(){
//        return employeePayrollService.allEmployee();
//    }
//
//    @PutMapping("/editEmployee/{id}")
//    public Employee editEmployeeById(@RequestBody Employee employee, @PathVariable Integer id){
//        return employeePayrollService.editEmployee(employee, id);
//    }
//
//    @DeleteMapping("/deleteEmployee/{id}")
//    public String deleteEmployeeId(@PathVariable Integer id){
//        employeePayrollService.deleteEmployee(id);
//        return "Data Deleted";
//    }
}