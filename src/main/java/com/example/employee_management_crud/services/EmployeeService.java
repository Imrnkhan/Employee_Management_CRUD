package com.example.employee_management_crud.services;

import com.example.employee_management_crud.Model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee EmployeeSave(Employee employee);
    public Employee getEmployeeByid(Integer id);
    public List<Employee> getAllEmployee();
    public Employee updateEmployee(Employee employee);
    public Employee deleteEmployeeByid(Integer id);

}
