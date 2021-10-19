//package za.ac.cput.repository.impl;

//import za.ac.cput.entity.Payment;
//import za.ac.cput.repository.PaymentRepository;
//import java.util.HashSet;
//import java.util.Set;

//** Payment Controller
// * Author: Chadleigh Dunbar (218065256)
// */

//public class PaymentImpl implements PaymentRepository{
//private static PaymentRepository paymentRepository = null;
//    private Set<Payment> paymentDB = null;

//    private PaymentRepositoryImpl() { this.paymentDB = new HashSet<>(); }

//    public static PaymentRepository getPaymentRepository() {
//        if (paymentRepository == null) paymentRepository = new PaymentRepositoryImpl();
//        return paymentRepository;
// }

//    @Override
//    public Payment create(Payment t) {
//        this.paymentDB.add(t);
//        return t;
//    }

//    @Override
//    public Payment read (String s) {
//      for (Payment payment : this.paymentDB){
//              if(payment.toString().equalsIgnoreCase(s))
//              return payment;
//              }
//      return null;
//}

//    @Override
//    public Payment update(Payment payment) {
//        Payment payment = read(payment.getpaymentId());
//        if (oldPayment != null){
//            this.paymentDB.remove(payment);
//            this.paymentDB.add(payment);
//        }
//        return payment;
//    }

//    @Override
//    public boolean delete(String paymentType) {
//        Payment payment = read(selectedpaymentType);
//        if (payment != null)
//         this.paymentDB.remove(payment);
//        return false;
//    }

//    @Override
//    public Set<Payment> getAll() {
//        return this.paymentDB;
//    }
//}
