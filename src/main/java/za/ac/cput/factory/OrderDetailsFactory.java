package za.ac.cput.factory;
import za.ac.cput.entity.OrderDetails;
import za.ac.cput.util.GenericHelper;
/** OrderDetailsFactory.java
 *  Factory for Order Details
 * Author: Mehluli Dlamini (219105359)
 **/

public class OrderDetailsFactory {
    public static OrderDetails createOrderDetails(String selectedAddress,double orderPrice , double shippingCost , double totalPrice)
    {
        String orderId = GenericHelper.generateAnId();
        String cusId = GenericHelper.generateAnId();
        String shippingId = GenericHelper.generateAnId();
        String orderDate = GenericHelper.generateDate();
        String shippingDate = GenericHelper.generateShippingDate();

        OrderDetails order = new OrderDetails.Builder()
                .setCusId(cusId)
                .setOrderId(orderId)
                .setOrderDate(orderDate)
                .setOrderPrice(orderPrice)
                .setShippingId(shippingId)
                .setShippingDate(shippingDate)
                .setShippingCost(shippingCost)
                .setSelectedAddress(selectedAddress)
                .setTotalPrice(totalPrice)
                .build();
        return order;
    }
}