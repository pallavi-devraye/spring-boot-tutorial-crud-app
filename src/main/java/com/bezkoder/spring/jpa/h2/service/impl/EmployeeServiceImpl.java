package com.bezkoder.spring.jpa.h2.service.impl;

import com.bezkoder.spring.jpa.h2.model.Employee;
import com.bezkoder.spring.jpa.h2.repository.EmployeeRepository;
import com.bezkoder.spring.jpa.h2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setFirstName(employee.getFirstName());
            updatedEmployee.setLastName(employee.getLastName());
            updatedEmployee.setDesignation(employee.getDesignation());
            updatedEmployee.setDepartment(employee.getDepartment());
            updatedEmployee.setAddress(employee.getAddress());
            return employeeRepository.save(updatedEmployee);
        }
        return null;
    }

    @Override
    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void
    deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
