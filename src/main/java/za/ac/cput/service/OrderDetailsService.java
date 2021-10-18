package za.ac.cput.service;

import org.junit.jupiter.api.Order;
import za.ac.cput.entity.OrderDetails;
import za.ac.cput.entity.OrderDetails;

import java.util.Set;

public interface OrderDetailsService extends IService<OrderDetails, String> {
    Set<OrderDetails> getAll();

}