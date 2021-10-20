package za.ac.cput.service.impl;
//Author: Damian Du Toit (219200203)

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Customer;
import za.ac.cput.repository.CustomerRepository;
import za.ac.cput.service.CustomerService;
import java.util.Set;
import java.util.stream.Collectors;

//Customer Implementation Service Class
@Service
public class CustomerImp implements CustomerService {
    private static CustomerService service = null;

    @Autowired
    private CustomerRepository repository;

    @Override
    public Set<Customer> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Customer create(Customer customer) {
        return this.repository.save(customer);
    }

    @Override
    public Customer read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Customer update(Customer customer) {
        if (this.repository.existsById(customer.toString())){
            return this.repository.save(customer);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (this.repository.existsById(s)) return false;
        else return true;

    }
}
