package by.twikss.finalwork.ui;

import java.util.Scanner;

import static by.twikss.finalwork.App.log;

public class InputUserData {
    public static final Scanner in = new Scanner(System.in);

    private InputUserData() {
    }

    public static int userChooseMenu(){
        return in.nextInt();
    }

    public static long userChooseDeleteProductById(){
        return in.nextLong();
    }

    public static void userPressEnter(){
        log.info("do you want to carry on a job? (y/n)");
        in.next();
    }
}
