/* CartRepository.java
   Repository interface for Cart
   Author: Christopher Doolings
 */

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}