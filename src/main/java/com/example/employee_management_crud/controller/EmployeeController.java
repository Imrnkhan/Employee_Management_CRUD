package com.example.employee_management_crud.controller;


import com.example.employee_management_crud.Model.Employee;
import com.example.employee_management_crud.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


private EmployeeService employeeService ;


@PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployeeHandler(@RequestBody Employee employee){
Employee saveEmploye = employeeService.EmployeeSave(employee);
return new ResponseEntity<Employee>(saveEmploye, HttpStatus.CREATED);
}



@GetMapping("/employee/{id}")
public Employee getEmployeeId(@PathVariable("id")Integer id){
return employeeService.getEmployeeByid((id));
}

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>>getAllStudent(){
        List<Employee> employees = employeeService.getAllEmployee();
        return  new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id")
    public Employee deleteStudentByRoll(@PathVariable("id") Integer id){
        return employeeService.deleteEmployeeByid(id);
    }
    @PutMapping("/employee")
    public ResponseEntity<Employee> updateemployeHndler(@RequestBody Employee employ){
        Employee updateEmployee = employeeService.updateEmployee(employ);
        return new ResponseEntity<Employee>(updateEmployee,HttpStatus.ACCEPTED);
    }


}
