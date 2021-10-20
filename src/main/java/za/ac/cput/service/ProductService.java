package za.ac.cput.service;

/* ProductService.java
Service for Product
Author: Moegammad Ameer Dollie (218336934)
Date: October 2021
*/

import za.ac.cput.entity.Product;
import java.util.Set;

public interface ProductService extends IService<Product, String>{
    Set<Product> getAll();
}
