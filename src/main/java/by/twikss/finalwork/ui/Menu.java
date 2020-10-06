package by.twikss.finalwork.ui;

import by.twikss.finalwork.database.DataBase;
import by.twikss.finalwork.logics.service.ProductService;

import static by.twikss.finalwork.App.*;
import static by.twikss.finalwork.database.DataBase.baseOfProduct;

public class Menu {
    DataBase dataBaseProduct = new DataBase();

    public void runMenu(){
        boolean isWorking = true;
        while (isWorking) {
            MenuList.show();
            switch (InputUserData.userChooseMenu()){
                case 0:
                    isWorking = false;
                    break;
                case 1:

                    break;
                case 2:
                    log.info("Input id product that you want to see");
                    log.info(ProductService.getProductById(baseOfProduct
                            ,InputUserData.userChooseDeleteProductById())
                    .toString());
                    InputUserData.userPressEnter();
                    break;
                case 3:
                    ProductService.showAllProducts(baseOfProduct);
                    InputUserData.userPressEnter();
                    break;
                case 4:
                    log.info("Input id product that you want to delete");
                    ProductService.deleteProductById(baseOfProduct
                            ,InputUserData.userChooseDeleteProductById());
                    InputUserData.userPressEnter();
                    break;
                default:
                    log.info("There is no menu section");
            }
        }
    }
}
