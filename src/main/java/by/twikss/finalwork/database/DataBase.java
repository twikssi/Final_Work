package by.twikss.finalwork.database;

import by.twikss.finalwork.bean.Product;
import by.twikss.finalwork.enums.Category;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {
    private List<Product> baseOfProduct = new ArrayList<>();

    public List<Product> getBaseOfProduct() {
        return baseOfProduct;
    }


    public DataBase() {
        baseOfProduct.addAll(Arrays.asList(
                Product.builder()
                        .id(1l)
                        .name("Tolya")
                        .price(BigDecimal.valueOf(45.90))
                        .category(Category.VEGETABLES)
                        .discount(BigDecimal.valueOf(0.25))
                        .description("he")
                        .build(),

                Product.builder()
                        .id(2l)
                        .name("Onions")
                        .price(BigDecimal.valueOf(56.30))
                        .category(Category.VEGETABLES)
                        .discount(BigDecimal.valueOf(0.15))
                        .build(),

                Product.builder()
                        .id(3l)
                        .name("Orange")
                        .price(BigDecimal.valueOf(78.90))
                        .category(Category.FRUIT)
                        .build(),

                Product.builder()
                        .id(4l)
                        .name("Pineapple")
                        .price(BigDecimal.valueOf(60.0))
                        .category(Category.FRUIT)
                        .build()

        ));
    }
}
