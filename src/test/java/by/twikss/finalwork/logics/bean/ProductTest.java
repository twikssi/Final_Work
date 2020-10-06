package by.twikss.finalwork.logics.bean;

import by.twikss.finalwork.logics.enums.Category;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void CreateProducttest(){
        Product product = Product.builder()
                .id(1l)
                .name("tolya")
                .price(BigDecimal.valueOf(56.67))
                .category(Category.VEGETABLES)
                .build();

        System.out.println(product.toString());
        String expected = "Product(id=1, name=tolya, price=56.67, category=VEGETABLES, discount=null, description=null)";
        String actual = product.toString();
        assertEquals(expected, actual);
    }

}