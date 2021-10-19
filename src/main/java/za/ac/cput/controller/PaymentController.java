package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.entity.Payment;
import za.ac.cput.service.impl.PaymentServiceImp;
import java.util.Set;

/** Payment Controller
 * Author: Chadleigh Dunbar (218065256)
 */

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImp paymentService;

    @PostMapping("/create")
    public Payment create(@RequestBody Payment payment){
        Payment newPayment = PaymentFactory.createPayment("Visa");
        return paymentService.create(newPayment);
    }

    @GetMapping("/read/{id}")
    public Payment read(@PathVariable String id){
        return paymentService.read(id);
    }

    @PostMapping("/update")
    public Payment update(@RequestBody Payment payment){
        return paymentService.update(payment);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return paymentService.delete(id);
    }
}
