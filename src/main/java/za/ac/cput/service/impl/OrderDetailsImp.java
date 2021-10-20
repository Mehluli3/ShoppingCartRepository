package za.ac.cput.service.impl;
//Mehluli Dlamini 219105359 - October 2021 Capstone

import org.junit.jupiter.api.Order;
import za.ac.cput.entity.OrderDetails;
import za.ac.cput.repository.OrderDetailsRepository;
import za.ac.cput.service.OrderDetailsService;
import za.ac.cput.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrderDetailsImp implements OrderDetailsService {
    private static OrderDetailsService service = null;
    @Autowired
    private OrderDetailsRepository repository;

    @Override
    public Set<OrderDetails> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public OrderDetails create(OrderDetails orderDetails) {
        return this.repository.save(orderDetails);
    }

    @Override
    public OrderDetails read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public OrderDetails update(OrderDetails orderDetails) {
        if (this.repository.existsById(orderDetails.toString())){
            return this.repository.save(orderDetails);
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
