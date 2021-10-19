package za.ac.cput.factory;

/* ProductFactory.java
Factory for Product
Author: Moegammad Ameer Dollie (218336934)
Date: October 2021
*/

import za.ac.cput.entity.Product;
import za.ac.cput.util.GenericHelper;

public class ProductFactory{

    public static Product createProduct(String prodName, int prodPrice){
        String productId = GenericHelper.generateAnId();
        Product product = new Product.Builder()
                .setProdId(productId)
                .setProdName(prodName)
                .setProdPrice(prodPrice)
                .build();

        return product;
    }
    public static Product createProduct(String productDescription){
        return null;
    }
}
