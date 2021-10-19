package za.ac.cput.service.impl;

/* ProductImpTest.java
Service test for Product
Author: Moegammad Ameer Dollie (218336934)
Date: October 2021
*/

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.OrderDetails;
import za.ac.cput.entity.Product;
import za.ac.cput.factory.ProductFactory;
import za.ac.cput.service.ProductService;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ProductImpTest {
    @Autowired
    private static ProductService service;
    private static Product product = ProductFactory.createProduct("Laptop", 10000);

    @Test
    public void a_create() {
        Product created =  service.create(product);
        Assert.assertEquals(product.toString(), created.toString());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        Product read = service.read(product.toString());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Product updated = new Product.Builder().copy(product).build();
        updated = service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void d_getAll() {
        Set<Product> product = service.getAll();
        assertEquals(1, product.size());
        System.out.println("Product details : " + product);
    }

    @Test
    public void e_delete() {
        boolean deleted = service.delete(product.toString());
        Assert.assertTrue(deleted);
    }
}
