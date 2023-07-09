package com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Controller;

import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Address;
import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Employee;
import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

//    GET /employees - get all employees
    @GetMapping("employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
//    GET /employees/{id} - get an employee by id
    @GetMapping("employee/empId/{empId}")
    public Optional<Employee> getEmployee(@PathVariable Long empId){
        return employeeService.getEmployeeById(empId);
    }



//    POST /employees - create a new employee
     @PostMapping("employee")
     public String addEmployee(@RequestBody Employee employee){
         return employeeService.addEmployee(employee);
     }
//    PUT /employees/{id} - update an employee by id
    @PutMapping("employees/{id}/employeeName/{fName}")
    public String updateEmployeeById(@PathVariable Long id, @PathVariable String fName, @RequestBody Address address){
        return employeeService.updateEmployeeById(id,fName,address);
    }



//    DELETE /employees/{id} - delete an employee by id
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteById(id);
    }
}
