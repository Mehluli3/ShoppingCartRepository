package za.ac.cput.controller;
//Author: Damian Du Toit (219200203)

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Customer;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.service.impl.CustomerImp;

//Customer Controller Class
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerImp customerService;

    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer){
        Customer newCustomer = CustomerFactory.createCustomer(89783242, "Jake Parker", "0827865409", "jakep@gmail.com");
        return customerService.create(newCustomer); }

    @GetMapping("/read/{id}")
    public Customer read(@PathVariable String id){
        return customerService.read(id);
    }

    @PostMapping ("/update")
    public Customer update(@RequestBody Customer customer){
        return customerService.update(customer);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return customerService.delete(id);
    }
}
