package za.ac.cput.service;
//Author: Damian Du Toit (219200203)

import za.ac.cput.entity.Customer;

import java.util.Set;

//Customer Service Interface
public interface CustomerService extends IService<Customer, String>{
    Set<Customer> getAll();
}
