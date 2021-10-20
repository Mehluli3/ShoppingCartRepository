package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Cart;
import za.ac.cput.factory.CartFactory;
import za.ac.cput.service.impl.CartServiceImpl;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartServiceImpl cartService;

    @PostMapping("/create")
    public Cart create(@RequestBody Cart cart){
        Cart newCart = CartFactory
                .builder("", 0, 0);
        return cartService.create(newCart);
    }

    @GetMapping("/read/{customerid}")
    public Cart read(@PathVariable String customerid){
        return cartService.read(customerid);
    }

    @PostMapping("/update")
    public Cart update(@RequestBody Cart cart){
        return cartService.update(cart);
    }

    @DeleteMapping("/delete/{customerid}")
    public boolean delete(@PathVariable String customerid){
        return cartService.delete(customerid);
    }
}

