package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.OrderDetails;
import za.ac.cput.factory.OrderDetailsFactory;


public class OrderDetailsFactoryTest {

    @Test
    void createOrderDetails() {
        OrderDetails orderdetails = OrderDetailsFactory.createOrderDetails("859 Upalite Street , Kirkney Village , Pretoria 0082", 100,50, 150 );
        System.out.println(orderdetails);
    }

}