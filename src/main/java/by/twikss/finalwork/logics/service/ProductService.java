package by.twikss.finalwork.logics.service;

import by.twikss.finalwork.logics.bean.Product;
import by.twikss.finalwork.logics.enums.Category;

import java.math.BigDecimal;
import java.util.List;

import static by.twikss.finalwork.App.*;

public class ProductService {

    private ProductService() {
    }

    public static Product buildPerson(long id, String  name, double price, Category category, String discription, double discount){
        return Product.builder()
                .id(id)
                .name(name)
                .price(BigDecimal.valueOf(price))
                .category(category)
                .description(discription)
                .discount(BigDecimal.valueOf(discount))
                .build();
    }

    public static long getNextId(List<Product> products){
        return products.get(products.size()  - 1).getId() + 1l;
    }

    public static void addProduct(List<Product> productBase, Product product) {
        productBase.add(product);
    }

    public static Product getProductById(List<Product> productsBase, long id) {
        for (Product product: productsBase){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public static void showAllProducts(List<Product> productsBase) {
        for(Product product: productsBase){
            log.info(product.toString());
        }
    }

    public static void deleteProductById(List<Product> productsBase, long id) {
        for (Product product: productsBase){
            if (product.getId() == id){
                productsBase.remove(product);
                return;
            }
        }
    }
}
