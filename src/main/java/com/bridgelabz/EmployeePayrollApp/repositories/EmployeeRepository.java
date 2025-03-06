package com.bridgelabz.EmployeePayrollApp.repositories;

import com.bridgelabz.EmployeePayrollApp.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}
