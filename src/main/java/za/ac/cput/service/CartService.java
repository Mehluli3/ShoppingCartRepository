package za.ac.cput.service;

import za.ac.cput.entity.Cart;

import java.util.List;

public interface CartService extends IService<Cart, Integer> {
    List<Cart> getAll();
}
