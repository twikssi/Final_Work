package by.twikss.finalwork.logics.service;

import by.twikss.finalwork.logics.bean.Product;
import by.twikss.finalwork.database.DataBase;
import by.twikss.finalwork.logics.enums.Category;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static by.twikss.finalwork.database.DataBase.*;
import static org.junit.Assert.*;

public class ProductServiceTest {
    DataBase dataBaseProducts;

    @Before
    public void setup(){
        dataBaseProducts = new DataBase();
    }

    @Test
    public void addProduct() {
        Product parrot = Product.builder()
                .id(5l)
                .name("Parrot")
                .category(Category.VEGETABLES)
                .price(BigDecimal.valueOf(5.19))
                .build();

        ProductService.addProduct(baseOfProduct, parrot);

        assertTrue(baseOfProduct.contains(parrot));
    }

    @Test
    public void getProductById() {
        Product pineapple = Product.builder()
                .id(4l)
                .name("Pineapple")
                .category(Category.FRUIT)
                .price(BigDecimal.valueOf(60.0))
                .build();

        assertEquals(true,ProductService.getProductById(baseOfProduct,4l).equals(pineapple));
    }

    @Test
    public void deleteProductByIdTest() {
        Product orange = Product.builder()
                .id(3l)
                .name("Orange")
                .price(BigDecimal.valueOf(78.90))
                .category(Category.FRUIT)
                .build();

        ProductService.deleteProductById(baseOfProduct, 3l);
        assertFalse(baseOfProduct.contains(orange));

    }
}