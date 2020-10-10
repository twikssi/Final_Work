package by.twikss.finalwork.ui;

import static by.twikss.finalwork.App.log;

public class MenuList {

    private MenuList() {
    }

    public static void show(){
        log.info("Choose menu section");
        log.info("Summary:");
        log.info("0 - quit");
        log.info("1 - add product");
        log.info("2 - get product by Id");
        log.info("3 - show list products");
        log.info("4 - delete product by id");
    }

    public static void showCategories (){
        log.info("Choose category");
        log.info("1 - FRUIT");
        log.info("2 - VEGETABLE");
    }
}
