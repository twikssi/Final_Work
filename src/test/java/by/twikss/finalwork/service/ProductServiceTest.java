package by.twikss.finalwork.service;

import by.twikss.finalwork.bean.Product;
import by.twikss.finalwork.database.DataBase;
import by.twikss.finalwork.enums.Category;
import org.junit.Before;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.math.BigDecimal;

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

        ProductService.addProduct(dataBaseProducts.getBaseOfProduct(), parrot);

        assertTrue(dataBaseProducts.getBaseOfProduct().contains(parrot));
    }

    @Test
    public void getProductById() {
        Product pineapple = Product.builder()
                .id(4l)
                .name("Pineapple")
                .category(Category.FRUIT)
                .price(BigDecimal.valueOf(60.0))
                .build();

        assertEquals(true,ProductService.getProductById(dataBaseProducts.getBaseOfProduct(),4l).equals(pineapple));
    }


    @Test
    public void getAllProductsTest() {
        ProductService.getAllProducts(dataBaseProducts.getBaseOfProduct());
    }
}