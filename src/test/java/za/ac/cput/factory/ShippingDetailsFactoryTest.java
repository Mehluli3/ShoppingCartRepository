package za.ac.cput.factory;

/**
 * ShippingDetailsFactory.java
 * Shipping Details Factory
 * Author: Aderito Zacarias (215278739)
 **/


import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ShippingDetails;

import static org.junit.jupiter.api.Assertions.*;

class ShippingDetailsFactoryTest {

    @Test
    public void testFactory(){

        ShippingDetails shippingDetails = new ShippingDetailsFactory().getShippingDetails("Delivery",2);
        ShippingDetails shippingDetails2 = new ShippingDetailsFactory().getShippingDetails("Delivery",2);

        assertNotNull(shippingDetails);
        assertEquals("Delivery", shippingDetails.getShippingType());
        assertNotEquals(845, shippingDetails.getShippingCost());

        // Identity test | missing on assignment 3...
        assertNotEquals(shippingDetails.getShippingId(), shippingDetails2.getShippingId());

        System.out.println("1->  " + shippingDetails.getShippingId());
        System.out.println("2->  " + shippingDetails2.getShippingId());
    }

}