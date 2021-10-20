package za.ac.cput.service.impl;
//import org.graalvm.compiler.serviceprovider.IsolateUtil;
import org.junit.Test;
import org.junit.Assert;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.service.PaymentService;
import static org.junit.Assert.*;
//import org.springframework.bean.factory.annotation.Autowired;
import java.util.Set;

/** Payment ServiceTest
 * Author: Chadleigh Dunbar (218065256)
 */

    class PaymentImpTest {

        private static PaymentService service;
        private static Payment payment = PaymentFactory.createPayment("Visa");

        @Test
        void a_create(){
            Payment created = service.create(payment);
            Assert.assertEquals(payment.toString(), created.toString());
            System.out.println("Create: " + created);
        }

        @Test
        void b_read(){
            Payment read = service.read(payment.toString());
            System.out.println("Read: " + read);
        }

        @Test
        void c_update(){
            Payment updated = new Payment.Builder().copy(payment).build();
            updated = service.update(updated);
            System.out.println("Updated: " + updated);
        }

        @Test
        void e_delete(){
            boolean deleted = service.delete(payment.toString());
            Assert.assertTrue(deleted);

        }

        @Test
        void d_getAll(){
            Set<Payment> payment = service.getAll();
            assertEquals(1, payment.size());
            System.out.println("Payment Info :" + payment);
        }

}