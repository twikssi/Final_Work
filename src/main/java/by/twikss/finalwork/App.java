package by.twikss.finalwork;

import by.twikss.finalwork.ui.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();
    }
}
