package com.example.employeepayrollappspring.controller;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import com.example.employeepayrollappspring.dto.ResponseDTO;
import com.example.employeepayrollappspring.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeePayrollController {

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getEmployeeData() {
        Employee employee = null;
        employee = new Employee(1, new EmployeeDTO("Akshar","Hate","HR",25000 ));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", employee);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO>getEmployeeData(@PathVariable("empId") int empId){
        Employee employee = null;
        employee = new Employee(1, new EmployeeDTO("Akshar","Hate","HR",25000 ));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful for ID", employee);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = null;
        employee = new Employee(1, employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created employee Payroll data successfully", employee);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeeData(@PathVariable int empId,
                                                                 @RequestBody EmployeeDTO empPayrollDTO) {
        Employee employee = null;
        employee = new Employee(empId, empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated employee Payroll data successfully", employee);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable("empId") int empId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully", "Deleted id: " + empId);
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