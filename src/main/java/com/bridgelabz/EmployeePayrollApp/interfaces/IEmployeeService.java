
package com.bridgelabz.EmployeePayrollApp.interfaces;

import com.bridgelabz.EmployeePayrollApp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long id);

    Employee createEmployee(Employee employee);

    Optional<Employee> updateEmployee(Long id, Employee updatedEmployee);

    void deleteEmployee(Long id);
}
