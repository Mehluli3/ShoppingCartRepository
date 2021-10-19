package za.ac.cput.controller;

/* ProductController.java
Controller for Product
Author: Moegammad Ameer Dollie (218336934)
Date: October 2021
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Product;
import za.ac.cput.factory.ProductFactory;
import za.ac.cput.service.impl.ProductImp;

@RestController
@RequestMapping ("/products")
public class ProductController {

    @Autowired
    private ProductImp productService;

    @PostMapping("/create")
    public Product create(@RequestBody Product product){
        Product newProduct = ProductFactory
                .createProduct("", 0);
        return productService.create(newProduct);
    }

    @GetMapping("/read/{id}")
    public Product read(@PathVariable String id){
        return productService.read(id);
    }

    @PostMapping("/update")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return  productService.delete(id);
    }
}
