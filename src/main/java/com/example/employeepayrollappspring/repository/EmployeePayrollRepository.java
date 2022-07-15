package com.example.employeepayrollappspring.repository;

import com.example.employeepayrollappspring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
}
