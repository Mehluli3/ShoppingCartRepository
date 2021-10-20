package za.ac.cput.service.impl;
//import org.graalvm.compiler.serviceprovider.IsolateUtil;
import za.ac.cput.entity.OrderDetails;
import za.ac.cput.factory.OrderDetailsFactory;
import za.ac.cput.service.OrderDetailsService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
//Dlamini Mehluli 219105359
import java.util.Set;

import static org.junit.Assert.*;

class OrderDetailsImpTest {
    @Autowired
    private static OrderDetailsService service ;
    private static OrderDetails orderDetails =
  OrderDetailsFactory.createOrderDetails("859 Upalite Street , Kirkney Village , Pretoria 0082", 100,50, 150 );


    @Test
    public void d_getAll() {
        Set<OrderDetails> orderDetails = service.getAll();
        assertEquals(1, orderDetails.size());
        System.out.println("Here are the order details : " + orderDetails);
    }

    @Test
    public void a_create() {
        OrderDetails created =  service.create(orderDetails);
        Assert.assertEquals(orderDetails.toString(), created.toString());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        OrderDetails read =  service.read(orderDetails.toString());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        OrderDetails updated = new OrderDetails.Builder().copy(orderDetails).build();
        updated =  service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void f_delete() {
        boolean deleted = service.delete(orderDetails.toString());
        Assert.assertTrue(deleted);

    }
}