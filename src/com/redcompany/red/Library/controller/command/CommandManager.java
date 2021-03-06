package com.redcompany.red.Library.controller.command;

import com.redcompany.red.Library.controller.command.impl.*;

public class CommandManager {

    // это С в MVC . принимает команду от V и передает ее

    private static BasicCommand command = new DefaultCommand();

    public static BasicCommand defineCommand(String action){
        switch (action){
            case "view_catalog":
                command = new ViewBookCatalogCommand();
                break;
            case "single_row":
                command = new ViewSingleCatalogRowCommand();
                break;
            case "find_book":
                command = new ViewBookFindByTitleCommand();
                break;
            case "add_book":
                command = new AddNewBookToCatalogCommand();
                break;
            case "test_test":
                command = new ViewBookLibraryCommand();
                break;
        }
        return command;
    }
}
