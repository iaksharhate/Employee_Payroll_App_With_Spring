package com.example.employeepayrollappspring.model;

import com.example.employeepayrollappspring.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_payroll")
public @Data class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int id;
    @Column(name = "empName")
    private String name;
    private long salary;
    private String gender;
    private @NotNull(message = "Date should not be empty") @PastOrPresent(message = "Date should be past or today's date.")
    LocalDate startDate;
    private String note;
    private String profilePic;
    @ElementCollection
    @CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> department;

    public Employee(EmployeeDTO employeeDTO) {
        this.updateEmployee(employeeDTO);
    }

    public void updateEmployee(EmployeeDTO employeeDTO) {
        this.name = employeeDTO.getName();
        this.salary = employeeDTO.getSalary();
        this.gender = employeeDTO.getGender();
        this.startDate = employeeDTO.getStartDate();
        this.note = employeeDTO.getNote();
        this.profilePic = employeeDTO.getProfilePic();
        this.department = employeeDTO.getDepartment();
    }
}
