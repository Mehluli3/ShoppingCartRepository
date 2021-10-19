package za.ac.cput.factory;
/**
 * ShippingDetailsFactory.java
 * Shipping Details Factory
 * Author: Aderito Zacarias (215278739)
 * 11 June 2021
 **/

import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.util.GenericHelper;

public class ShippingDetailsFactory {
    public static ShippingDetails getShippingDetails(String shippingType, double shippingCost){
//        String shippingId = GenericHelper.generateAnId();
        return new ShippingDetails.Builder()
                    .setShippingId(GenericHelper.generateAnId())
                    .setShippingType(shippingType)
                    .setShippingCost(shippingCost)
                    .build();
    }


}
