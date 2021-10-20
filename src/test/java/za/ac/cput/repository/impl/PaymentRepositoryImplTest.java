package za.ac.cput.repository.impl;////package za.ac.cput.repository.impl;
//
////import org.junit.FixMethodOrder;
////import org.junit.Test;
////import org.junit.runners.MethodSorters;
////import za.ac.cput.entity.Payment;
////import za.ac.cput.factory.PaymentFactory;
////import za.ac.cput.repository.PaymentRepository;
////import org.springframework.beans.factory.annotation.Autowired;
//
////import static org.junit.Assert.assertEquals;
////import java.util.Set;
//
////@FixMethodOrderer(MethodSorters.NAME_ASCENDING)
////class PaymentRepositoryImplTest {
//
////    @Autowired
////    private static PaymentRepository repository;
////    private static Payment payment = PaymentFactory.createPayment("Visa");
//
////   @Test
////    void a_create(){
////        Payment created = repository.create(payment);
////        assertEquals(payment.getPaymentId(), created.getPaymentId());
////        System.out.println("Create: " + created);
////    }
//
////    @Test
////    void b_read(){
////        Payment read = repository.read(payment.toString());
////        System.out.println("Read: " + read);
////    }
//
////    @Test
////    void c_update(){
////        Payment updated = new Payment.Builder().copy(payment).setId(001).build();
////        updated = repository.update(updated);
////        System.out.println("Updated: " + update);
////    }
//
////    @Test
////    void e_delete(){
////      repository.delete(payment.getPaymentId());
////    }
//
////    @Test
////    void d_getAll(){
////        Set<Payment> payment = repository.getAll();
////        assertEquals(1, payment.size());
////        System.out.println(repository.getAll());
////    }
//
//
//
//
//
//
//
//
//
//}