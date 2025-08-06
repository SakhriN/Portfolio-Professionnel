package models;

import org.example.models.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product product;

    @Test
    void TestNormal(){
        product = new Product();
        product.setSellin(12);
        product.setQuality(50);
        product.Update(product);
        Assertions.assertTrue(product.getSellin()==11 && product.getQuality()==49);
    }

    @Test
    void TestBrieVieilli(){
        product = new Product();
        product.setSellin(12);
        product.setQuality(50);
        product.setName("Brie vieilli");
        product.UpdateWithName(product);
        Assertions.assertTrue(product.getSellin()==11 && product.getQuality()==51);
    }


}
