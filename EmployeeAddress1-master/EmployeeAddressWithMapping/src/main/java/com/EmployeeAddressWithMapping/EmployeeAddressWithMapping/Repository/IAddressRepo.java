package com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Repository;

import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
