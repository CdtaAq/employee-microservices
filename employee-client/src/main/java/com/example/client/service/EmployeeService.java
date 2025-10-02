package com.example.client.service;

import com.example.client.entity.Employee;
import com.example.client.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
