package za.ac.cput.factory;
//Author: Damian Du Toit (219200203)

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Customer;

//Customer Factory Test Class
class CustomerFactoryTest {
    @Test
    void createOrderDetails() {
        Customer customer = CustomerFactory.createCustomer(9746378, "John Jones", "0725748846", "johnjones@gmail.com");
    }
}
