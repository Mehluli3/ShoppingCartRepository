package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * ShippingDetails.java
 * Shipping Details Entity
 * Author: Aderito Zacarias - 215278739
 **/

@Entity
public class ShippingDetails implements Serializable{

    @Id
    private String shippingId;
    private String shippingType;
    private double shippingCost;

    private ShippingDetails(Builder builder){
        this.shippingId = builder.shippingId;
        this.shippingType = builder.shippingType;
        this.shippingCost = builder.shippingCost;
    }

    public String getShippingId() {
        return shippingId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void updateShippingInfo(double cost){
        /**Code Update Shipping Information**/

    }


    @Override
    public String toString() {
        return "ShippingDetails{" +
                "shippingId=" + shippingId +
                ", shippingType='" + shippingType + '\'' +
                ", shippingCost=" + shippingCost +
                '}';
    }

    //    BUILDER CLASS
    public static class Builder{
        private String shippingId;
        private String shippingType;
        private double shippingCost;

        public Builder setShippingId(String shippingId) {
            this.shippingId = shippingId;
            return this;
        }

        public Builder setShippingType(String shippingType) {
            this.shippingType = shippingType;
            return this;
        }

        public Builder setShippingCost(double shippingCost) {
            this.shippingCost = shippingCost;
            return this;
        }

        public ShippingDetails build(){
            return new ShippingDetails(this);
        }
    }

}
