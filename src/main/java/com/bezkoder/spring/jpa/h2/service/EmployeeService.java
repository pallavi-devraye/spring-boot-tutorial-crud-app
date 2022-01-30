package com.bezkoder.spring.jpa.h2.service;

import com.bezkoder.spring.jpa.h2.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Employee updateEmployee(long id, Employee employee);

    Employee getEmployee(long id);

    void deleteEmployee(long id);

    List<Employee> getAllEmployees();
}
