package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payment;
import static org.junit.jupiter.api.Assertions.*;

/** PaymentFactoryTest.java
 *  Factory Testing for Payment
 *  Author: Chadleigh Dunbar (218065256)
 */

public class PaymentFactoryTest {
    @Test
    void createPayment() {
        Payment payment = PaymentFactory.createPayment(001, "Visa");
        System.out.println(payment);
    }


}
