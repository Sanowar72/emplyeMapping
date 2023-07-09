package com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Controller;

import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Model.Address;
import com.EmployeeAddressWithMapping.EmployeeAddressWithMapping.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;



    //    GET /addresses - get all addresses
    @GetMapping("address")
    public List<Address> getAllAddress(){
        return  addressService.getAllAddress();
    }
//    GET /addresses/{id} - get an address by id
    @GetMapping("address/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }


//    POST /addresses - create a new address
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
     return addressService.saveAddress(address);
    }
//    PUT /addresses/{id} - update an address by id
    @PutMapping("address/{id}/city/{city}")
    public String updateAddressCity(@PathVariable Long id,@PathVariable String city){
        return addressService.updateAddressCity(id,city);
    }


//    DELETE /addresses/{id} - delete an address by id
    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Long id){
       return addressService.deleteAddressById(id);
    }
}
