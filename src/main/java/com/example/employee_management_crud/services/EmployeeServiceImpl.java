package com.example.employee_management_crud.services;

import com.example.employee_management_crud.EmployeeException.EmpException;
import com.example.employee_management_crud.Model.Employee;
import com.example.employee_management_crud.repository.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeRepo employeRepo;


    @Override
    public Employee EmployeeSave(Employee employee) {
return employeRepo.save(employee);

    }


//================================================================================

    @Override
    public Employee getEmployeeByid(Integer id) {

        Optional<Employee> op = employeRepo.findById(id);
        if(op.isPresent()){
Employee employee = op.get();
return employee;
        }
else {
            throw new EmpException("Employee does not this id "+id);
        }
    }

    //=======================================================================

    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> emp = employeRepo.findAll();
if(emp.size()>0){
return emp;
}else
    throw new  EmpException("no emp found");
    }


    //=========================================================================================


    @Override
    public Employee updateEmployee() {
Optional<Employee> ops = employeRepo.findById(updateEmployee().getEmpid());
if(ops.isPresent()){
    Employee employeeExist = ops.get();
    return employeRepo.save(updateEmployee());
}
else
    throw new EmpException("not found");
    }



//==========================================================================


    @Override
    public Employee deleteEmployeeByid(Integer id) {
        Employee existEmp= employeRepo.findById(id).orElseThrow( () -> new EmpException("Employee does not exist :"+id) );

        employeRepo.delete(existEmp);

        return existEmp;
    }

}
