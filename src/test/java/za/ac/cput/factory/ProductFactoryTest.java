package za.ac.cput.factory;

/* ProductFactoryTest.java
Factory test for Product
Author: Moegammad Ameer Dollie (218336934)
Date: October 2021
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Product;

class ProductFactoryTest {

    @Test
    void createProduct(){
        Product product = ProductFactory.createProduct("Bread", 15);
        System.out.println(product);
    }
}
