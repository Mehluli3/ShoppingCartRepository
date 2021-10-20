package za.ac.cput.service.impl;

//import org.junit.jupiter.api.Pay;
import za.ac.cput.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.repository.PaymentRepository;
import za.ac.cput.service.PaymentService;


import java.util.Set;
import java.util.stream.Collectors;

/** Payment Service
 * Author: Chadleigh Dunbar (218065256)
 */

@Service
public class PaymentImp implements PaymentService {
    private static PaymentService service = null;
    @Autowired
    private PaymentRepository repository;

    @Override
    public Payment create(Payment payment){
        return (Payment) this.repository.save(payment);
    }

    @Override
    public Payment read(String s){
        return (Payment) this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Payment update(Payment payment){
        if(this.repository.existsById(payment.toString())) {
            return (Payment) this.repository.save(payment);
        }
        return null;
    }

    @Override
    public boolean delete(String s){
        this.repository.deleteById(s);
        if(this.repository.existsById(s))
            return false;
        else
            return true;
    }

    @Override
    public Set<Payment> getAll(){
        return (Set<Payment>) this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
