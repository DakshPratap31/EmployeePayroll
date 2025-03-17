package com.bridgelabz.EmployeePayrollApp.repositories;

import com.bridgelabz.EmployeePayrollApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
