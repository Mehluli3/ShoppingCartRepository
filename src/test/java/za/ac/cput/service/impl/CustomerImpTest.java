package za.ac.cput.service.impl;
//Author: Damian Du Toit (219200203)

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Customer;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.service.CustomerService;

import java.util.Set;

import static org.junit.Assert.assertEquals;

//Customer Implementation Test Class
class CustomerImpTest {
    private static CustomerService service ;
    private static Customer customer = CustomerFactory.createCustomer(273817321, "Jack Morrison", "0214576576", "jackmorrison@gmail.com");

    @Test
    public void d_getAll() {
        Set<Customer> customer = service.getAll();
        assertEquals(1, customer.size());
        System.out.println("Here is the list of customers: " + customer);
    }

    @Test
    public void a_create() {
        Customer created =  service.create(customer);
        Assert.assertEquals(customer.toString(), created.toString());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        Customer read =  service.read(customer.toString());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Customer updated = new Customer.Builder().copy(customer).build();
        updated =  service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void f_delete() {
        boolean deleted = service.delete(customer.toString());
        Assert.assertTrue(deleted);
    }
}
