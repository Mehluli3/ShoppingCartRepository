package za.ac.cput.repository;
//Author: Damian Du Toit (219200203)

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Customer;

//Customer Repository Interface
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
