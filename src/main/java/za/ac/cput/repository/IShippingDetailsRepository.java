package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.ShippingDetails;

public interface IShippingDetailsRepository extends JpaRepository<ShippingDetails, String> {
}
