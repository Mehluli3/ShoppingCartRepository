package za.ac.cput.service.impl;

/* ProductImp.java
Implementation of service for Product
Author: Moegammad Ameer Dollie (218336934)
Date: October 2021
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.OrderDetails;
import za.ac.cput.entity.Product;
import za.ac.cput.repository.ProductRepository;
import za.ac.cput.service.ProductService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductImp implements ProductService{
    private static ProductService service = null;

    @Autowired
    private ProductRepository repository;

    @Override
    public Set<Product> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Product create(Product product){
        return this.repository.save(product);
    }

    @Override
    public Product read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Product update(Product product) {
        if (this.repository.existsById(product.toString())){
            return this.repository.save(product);
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
