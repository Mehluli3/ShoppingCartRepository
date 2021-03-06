package za.ac.cput.repository;

/**
 * ShippingDetailsFactory.java
 * Shipping Details Repository Interface
 * Author: Aderito Zacarias (215278739)
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.ShippingDetails;

public interface IShippingDetailsRepository extends JpaRepository<ShippingDetails, String> {
}
