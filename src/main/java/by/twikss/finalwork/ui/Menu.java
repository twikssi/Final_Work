package by.twikss.finalwork.ui;

import by.twikss.finalwork.App;
import by.twikss.finalwork.database.DataBase;
import by.twikss.finalwork.logics.service.ProductService;

import static by.twikss.finalwork.App.*;

public class Menu {

    public void runMenu(){
        boolean isWorking = true;
        while (isWorking) {
            MenuList.show();
            switch (InputUserData.userChooseMenu()){
                case 0:
                    isWorking = false;
                    break;
                case 3:
                    ProductService.showAllProducts(new DataBase().getBaseOfProduct());
                    break;
                default:
                    log.info("There is no menu section");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
