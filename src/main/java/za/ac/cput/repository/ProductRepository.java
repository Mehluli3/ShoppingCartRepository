package za.ac.cput.repository;

/* ProductRepository.java
Repo for Product
Author: Moegammad Ameer Dollie (218336934)
Date: October 2021
*/

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
