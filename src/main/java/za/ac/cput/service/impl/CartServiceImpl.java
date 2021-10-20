package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Cart;
import za.ac.cput.repository.CartRepository;
import za.ac.cput.service.CartService;

import java.util.ArrayList;
import java.util.List;


@Service
public class CartServiceImpl implements CartService {
    private static CartService cartService = null;

    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> getAll() {
        return new ArrayList<>(this.cartRepository.findAll());
    }

    @Override
    public Cart create(Cart cart) {
        return this.cartRepository.save(cart);
    }

    @Override
    public Cart read(String customerId) {
        return this.cartRepository.findById(customerId).orElse(null);
    }

    @Override
    public Cart update(Cart cart) {
        if (this.cartRepository.existsById(cart.getCustomerId())) {
            return this.cartRepository.save(cart);
        }
        return null;
    }

    @Override
    public boolean delete(String customerId) {
        this.cartRepository.deleteById(customerId);
        return !this.cartRepository.existsById(customerId);
    }
}
