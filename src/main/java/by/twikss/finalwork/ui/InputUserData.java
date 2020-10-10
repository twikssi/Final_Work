package by.twikss.finalwork.ui;

import by.twikss.finalwork.App;
import by.twikss.finalwork.logics.enums.Category;

import java.util.Scanner;

import static by.twikss.finalwork.App.log;

public class InputUserData {
    public static final Scanner in = new Scanner(System.in);

    private InputUserData() {
    }

    public static String userInputName(){
        log.info("Input name product");
        String name = userInputString();
        name += in.nextLine();
        return name;
    }

    public static double userInputPrice(){
        log.info("Input price product. Example (98.34)");
        double price = userInputDouble();
        return price;
    }

    public static String userInputDiscription(){
        log.info("Input discription product");
        String disc = userInputString();
        disc += in.nextLine();
        return disc;
    }

    public static double userInputDiscount(){
        log.info("Input discount product. You can write numbers from 0.0 to 1. Example (0.5)");
        double price = userInputDouble();
        if ( price >= 0 && price <= 1){
            return price;
        } else {
            log.info("Wrong data, try again");
           return userInputDiscount();
        }
     }

    public static Category userInputCategory() {
            MenuList.showCategories();
            switch (userChooseMenu()) {
                case 1:
                    return Category.VEGETABLES;
                case 2:
                    return Category.FRUIT;
                default:
                    log.info("there isn't categories");
                    return userInputCategory();
            }
    }

    public static long userInputLong() {
        return in.nextLong();
    }

    public static String userInputString() {
        return in.next();
    }

    public static double userInputDouble() {
        return in.nextDouble();
    }

    public static int userChooseMenu() {
        return in.nextInt();
    }

    public static long userChooseDeleteProductById() {
        return in.nextLong();
    }

    public static void userPressEnter() {
        log.info("do you want to carry on a job? (y/n)");
        in.next();
    }
}
