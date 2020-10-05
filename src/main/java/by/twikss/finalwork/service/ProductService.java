package by.twikss.finalwork.service;

import by.twikss.finalwork.App;
import by.twikss.finalwork.bean.Product;

import java.util.List;

import static by.twikss.finalwork.App.*;

public class ProductService {


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

    public static void getAllProducts(List<Product> productsBase) {
        for(Product product: productsBase){
            log.info(product.toString());
        }
    }

    public void deleteProductById(List<Product> productsBase, long id) {

    }
}
