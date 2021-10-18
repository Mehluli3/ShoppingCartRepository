//package za.ac.cput.repository.impl;
//
//import za.ac.cput.entity.OrderDetails;
//import za.ac.cput.repository.OrderDetailsRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class OrderDetailsImpl implements OrderDetailsRepository {
//
//    private Set<OrderDetails> addressDB;
//    private static OrderDetailsRepository orderDetailsRepository = null;
//
//
//    private  OrderDetailsRepositoryImpl(){
//        this.orderDetailsDB = new HashSet<>();
//
//    }
//    public  static OrderDetailsRepository getOrderDetailsRepository(){
//        if(orderDetailsRepository == null) orderDetailsRepository = new OrderDetailsRepositoryImpl();
//        return orderDetailsRepository;
//
//    }
//
//
//    @Override
//    public OrderDetails create(OrderDetails t){
//        this.orderDetailsDB.add(t);
//        return t;
//    }
//
//    @Override
//    public OrderDetails read(String s) {
//        for (OrderDetails orderDetails : this.orderDetailsDB){
//            if (orderDetails.toString().equalsIgnoreCase(s)) return orderDetails;
//        }
//        return null;
//    }
//
//
//    @Override
//    public OrderDetails update(OrderDetails orderDetails){
//        OrderDetails orderDetails = read(orderDetails.getOrderId());
//        if (oldOrderDetails != null){
//            this.orderDetailsDB.remove(orderDetails);
//            this.orderDetailsDB.add(orderDetails);
//        }
//        return orderDetails;
//    }
//    @Override
//    public boolean delete(String selectedAddress){
//        OrderDetails orderDetails = read(selectedAddress);
//        if (orderDetails != null)
//            this.orderDetailsDB.remove(orderDetails);
//
//
//        return false;
//    }
//    @Override
//    public Set<OrderDetails> getAll() {
//        return this.orderDetailsDB;
//    }
//}