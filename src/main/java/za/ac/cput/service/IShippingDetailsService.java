package za.ac.cput.service;

import za.ac.cput.entity.ShippingDetails;

import java.util.Set;

public interface IShippingDetailsService extends IService<ShippingDetails, String> {
    Set<ShippingDetails> getAll();

}
