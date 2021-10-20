package za.ac.cput.service.impl;

/**
 * ShippingDetailsFactory.java
 * Shipping Details Factory
 * Author: Aderito Zacarias (215278739)
 **/

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ShippingDetails;
import za.ac.cput.factory.ShippingDetailsFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShippingDetailsServiceTest {

    static ShippingDetailsService service;
    static ShippingDetails shippingDetailsByRoad, shippingDetailsByAir;
    static Set dateSet;


    @BeforeAll
    static void factory() {
//        service = ShippingDetailsService.getShippingService();
        shippingDetailsByRoad = ShippingDetailsFactory.getShippingDetails("Road", 200);
        shippingDetailsByAir = ShippingDetailsFactory.getShippingDetails("Air", 400);

        assertNotNull(service);
        assertNotNull(shippingDetailsByAir);
        assertNotNull(shippingDetailsByRoad);
        assertNotEquals(shippingDetailsByAir, shippingDetailsByRoad);
    }


    @Test
    void create() {
        service.create(shippingDetailsByAir);
        service.create(shippingDetailsByRoad);

        dateSet = service.getAll();

        assertFalse(dateSet.isEmpty());
        assertTrue(dateSet.contains(shippingDetailsByAir));
        assertTrue(dateSet.contains(shippingDetailsByRoad));
        assertTrue(dateSet.containsAll(service.getAll()));
        assertEquals(2, dateSet.size());
        assertNotEquals(3, dateSet.size());

        System.out.println("DataSet: " + dateSet);
    }

    @Test
    void read() {
        ShippingDetails readShippingDetails = service.read(shippingDetailsByAir.getShippingId());

        assertFalse(false);
        assertEquals(shippingDetailsByAir, readShippingDetails);
        assertNotEquals(shippingDetailsByRoad, readShippingDetails);
        assertNotEquals("1de96cbd-6f8d-474b-a1b0-ac27c10e38b5", readShippingDetails.getShippingId());
        assertNotEquals(service.read(shippingDetailsByAir.getShippingId()), service.read(shippingDetailsByRoad.getShippingId()));

        System.out.println(service.read(shippingDetailsByAir.getShippingId()));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

}