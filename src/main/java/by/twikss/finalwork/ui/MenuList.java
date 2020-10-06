package by.twikss.finalwork.ui;

import by.twikss.finalwork.App;

import static by.twikss.finalwork.App.log;

public class MenuList {

    public static void show(){
        log.info("Choose menu section");
        log.info("Summary:");
        log.info("0 - quit");
        log.info("1 - add product");
        log.info("2 - get product by Id");
        log.info("3 - show list products");
        log.info("4 - delete product by id");
    }
}
