package za.ac.cput.repository;
//Dlamini M 219105359 - October 2021
import za.ac.cput.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, String>{

}
