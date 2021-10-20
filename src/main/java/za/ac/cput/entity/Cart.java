/* Cart.java
   Entity class for Cart
   Author: Christopher Doolings
 */

package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cart implements Serializable {

    @Id
    private String customerId;
    private String productId, productName;
    private int quantity;
    private double orderPrice;

    public Cart() {}

    private Cart(Builder builder) {
        this.customerId = builder.customerId;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.quantity = builder.quantity;
        this.orderPrice = builder.orderPrice;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public static class Builder {
        private String customerId;
        private String productId, productName;
        private int quantity;
        private double orderPrice;

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setOrderPrice(double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }

        public Cart builder() {
            return new Cart(this);
        }

        public Builder copy(Cart cart) {
            this.customerId = cart.customerId;
            this.productId = cart.productId;
            this.productName = cart.productName;
            this.quantity = cart.quantity;
            this.orderPrice = cart.orderPrice;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customerId='" + customerId + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
