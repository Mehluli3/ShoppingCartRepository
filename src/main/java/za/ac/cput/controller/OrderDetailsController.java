package za.ac.cput.controller;

import za.ac.cput.entity.OrderDetails;
import za.ac.cput.factory.OrderDetailsFactory;
import za.ac.cput.service.impl.OrderDetailsImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/orderdetails")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsImp orderDetailsService;

    @PostMapping("/create")
    public OrderDetails create(@RequestBody OrderDetails orderDetails){ OrderDetails newOrderDetails
                = OrderDetailsFactory
                .createOrderDetails
                        ("88 Constant Avenue,WC,2021",100.00,250.00,25.00);
        return orderDetailsService.create(newOrderDetails); }

    @GetMapping("/read/{id}")
    public OrderDetails read(@PathVariable String id){
        return orderDetailsService.read(id);
    }

    @PostMapping ("/update")
    public OrderDetails update(@RequestBody OrderDetails orderDetails){
        return orderDetailsService.update(orderDetails);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return orderDetailsService.delete(id);
    }
}