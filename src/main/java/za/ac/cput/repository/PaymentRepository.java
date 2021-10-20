package za.ac.cput.repository;

import za.ac.cput.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

// Author: Chadleigh Dunbar (218065256)

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {}