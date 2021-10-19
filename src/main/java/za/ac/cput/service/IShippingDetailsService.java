package za.ac.cput.service;

/**
 * ShippingDetailsFactory.java
 * Shipping Details Service Interface
 * Author: Aderito Zacarias (215278739)
 **/

import za.ac.cput.entity.ShippingDetails;

import java.util.Set;

public interface IShippingDetailsService extends IService<ShippingDetails, String> {
    Set<ShippingDetails> getAll();

}
