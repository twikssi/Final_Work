package by.twikss.finalwork.ui;

import java.util.Scanner;

public class InputUserData {
    public static Scanner in = new Scanner(System.in);

    public static int userChooseMenu(){
        return in.nextInt();
    }

    public static long userChooseDeleteProductById(){
        return in.nextLong();
    }
}
