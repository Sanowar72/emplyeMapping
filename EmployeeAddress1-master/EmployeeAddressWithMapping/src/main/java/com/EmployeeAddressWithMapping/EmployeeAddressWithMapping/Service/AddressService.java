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
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    @Autowired
    IEmployeeRepo employeeRepo;
    public String saveAddress(Address address) {
        addressRepo.save(address);
        return "address Added";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public String updateAddressCity(Long id, String city) {
        Optional<Address> address = addressRepo.findById(id);
        Address address1 = address.orElse(null);
        assert address1 != null;
        address1.setCity(city);
        addressRepo.save(address1);
        return "City Updated";
    }

    public String deleteAddressById(Long id) {
        Optional<Address> address = addressRepo.findById(id);
         Address address1 = address.orElse(null);
         Employee employee = employeeRepo.findByAddress(address1);
        if(employee!=null){
            employee.setAddress(null);
           if(address1!=null){
               addressRepo.delete(address1);
               return "address Deleted";
           }
        }
            if (address1!=null){ addressRepo.delete(address1); return "address Deleted !!!";}

            return "Invalid Id";

    }
}
