/* CartFactory.java
   Factory class for Cart
   Author: Christopher Doolings
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Cart;
import za.ac.cput.util.GenericHelper;

public class CartFactory {
    public static Cart builder(String productName, int quantity, double orderPrice) {
        String customerId = GenericHelper.generateAnId();
        String productId = GenericHelper.generateAnId();

        return new Cart.Builder()
                .setCustomerId(customerId)
                .setProductId(productId)
                .setProductName(productName)
                .setQuantity(quantity)
                .setOrderPrice(orderPrice)
                .builder();
    }
}
