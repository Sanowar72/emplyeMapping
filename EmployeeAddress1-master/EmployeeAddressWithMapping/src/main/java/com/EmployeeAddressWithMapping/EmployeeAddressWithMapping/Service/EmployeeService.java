package com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Service;

import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Address;
import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Employee;
import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Repository.IAddressRepo;
import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;
    @Autowired
    IAddressRepo addressRepo;
    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee Added";
    }

    public List<Employee> getAllEmployee() {
       return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long empId) {
        return employeeRepo.findById(empId);
    }

    public String updateEmployeeById(Long id, String fName, Address address) {
       Optional<Employee> employee= employeeRepo.findById(id);
        addressRepo.save(address);
        assert employee.orElse(null) != null;
        employee.orElse(null).setAddress(address);
        employee.orElse(null).setFirstName(fName);
        employeeRepo.save(employee.orElse(null));
        return "Employee Updated";
    }

    public String deleteById(Long id) {
      Optional<Employee> employee = employeeRepo.findById(id);
        assert employee.orElse(null) != null;
        employeeRepo.delete(employee.orElse(null));
        return "employee Deleted";
    }
}
