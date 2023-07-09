package com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Repository;

import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Address;
import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
    Employee findByAddress(Address address1);
}
