package com.redcompany.red.Library.controller.console.view;

import java.util.HashMap;
import java.util.Map;

public class SimpleConsoleView {

    public static Map<String, Object> userInput = new HashMap<>();


    public static void showBasicMenu() {
        System.out.println("1 - view books catalog");
        System.out.println("2 - view single catalog row");
        System.out.println("3 - find book by title");
        System.out.println("4 - add new book");
    }

    public static Map<String, Object> readUserInput() {
        int item = readMenuItem();
        getInputData(item);

        return userInput;
    }

    private static void getInputData(int menuItem) {

        switch (menuItem) {
            case 1:
                userInput.put("user_action", "view_catalog");
                break;
            case 2:
                //Scanner sc = new Scanner(System.in);
                // get row number from console
                userInput.put("user_action", "single_row");
                userInput.put("row_number", 2);
                break;
            case 3:
                userInput.put("user_action", "find_book");
                userInput.put("book_title", 1);
                break;
            case 4:
                //implement later
                break;
        }

    }

    private static int readMenuItem() {
        // use scanner to get menu item
        return 1; //2 ....5
    }
}