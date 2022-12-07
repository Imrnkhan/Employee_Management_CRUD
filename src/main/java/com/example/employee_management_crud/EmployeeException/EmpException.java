package com.example.employee_management_crud.EmployeeException;

public class EmpException extends RuntimeException {
    public EmpException() {

    }

public EmpException(String message){
        super(message);
}
}
