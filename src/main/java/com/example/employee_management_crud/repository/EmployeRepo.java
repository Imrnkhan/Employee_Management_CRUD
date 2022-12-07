package com.example.employee_management_crud.repository;


import com.example.employee_management_crud.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepo extends JpaRepository<Employee,Integer> {
}
