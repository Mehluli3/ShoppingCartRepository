package za.ac.cput.factory;
import za.ac.cput.entity.Payment;
import java.util.UUID;

/** PaymentFactory.java
 *  Author: Chadleigh Dunbar (218065256)
 */

public class PaymentFactory {

        public static Payment payment(String paymentType){
            if(paymentType.isEmpty())
                return null;
            String paymentId = UUID.randomUUID().toString();
            return new Payment.Builder()
                    .setPaymentId(paymentId).setPaymentType(paymentType).build();
        }

    public static Payment createPayment(String paymentDescription) {
            return null;
    }
}


