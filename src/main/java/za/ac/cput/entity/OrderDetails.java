package za.ac.cput.entity;

//Dlamini Mehluli 219105359 - October 2021

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class OrderDetails implements Serializable
{
    @Id
    private String orderId;
    private String cusId;
    private String orderDate;
    private String shippingId;
    private String shippingDate;
    private String selectedAddress;
    private double shippingCost;
    private double orderPrice;
    private double totalPrice;
    /**public int calcTotal;
     public String placeOrder;
     public boolean cancelOrder;**/
    protected OrderDetails(){
    }

    private OrderDetails(Builder builder){
        this.cusId = builder.cusId;
        this.orderId = builder.orderId;
        this.orderDate = builder.orderDate;
        this.orderPrice = builder.orderPrice;
        this.shippingId = builder.shippingId;
        this.shippingDate = builder.shippingDate;
        this.shippingCost = builder.shippingCost;
        this.selectedAddress = builder.selectedAddress;
        this.totalPrice = builder.totalPrice;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderID=" + orderId +
                ", cusId=" + cusId +
                ", orderDate='" + orderDate + '\'' +
                ", shippingId=" + shippingId +
                ", shippingDate='" + shippingDate + '\'' +
                ", selectedAddress='" + selectedAddress + '\'' +
                ", shippingCost=" + shippingCost +
                ", orderPrice=" + orderPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static class Builder{
        private String orderId;
        private String cusId;
        private String orderDate;
        private String shippingId;
        private String shippingDate;
        private String selectedAddress;
        private double shippingCost;
        private double orderPrice;
        private double totalPrice;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setCusId(String cusId) {
            this.cusId = cusId;
            return this;
        }

        public Builder setOrderDate(String orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setShippingId(String shippingId) {
            this.shippingId = shippingId;
            return this;
        }

        public Builder setShippingDate(String shippingDate) {
            this.shippingDate = shippingDate;
            return this;
        }

        public Builder setSelectedAddress(String selectedAddress) {
            this.selectedAddress = selectedAddress;
            return this;

        }

        public Builder setShippingCost(double shippingCost) {
            this.shippingCost = shippingCost;
            return this;
        }

        public Builder setOrderPrice(double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public OrderDetails build(){
            return new OrderDetails(this);
        }
        //This is my copy of the builder class
        public Builder copy(OrderDetails orderDetails){
            this.cusId = orderDetails.cusId;
            this.orderId = orderDetails.orderId;
            this.orderDate = orderDetails.orderDate;
            this.orderPrice = orderDetails.orderPrice;
            this.shippingId = orderDetails.shippingId;
            this.shippingDate = orderDetails.shippingDate;
            this.selectedAddress = orderDetails.selectedAddress;
            this.orderPrice = orderDetails.orderPrice;
            this.totalPrice = orderDetails.totalPrice;
            return this;
        }


    }
}