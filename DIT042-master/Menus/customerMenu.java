package Menus;

import Customer.customerMenuOption;
import Utilities.userInput;

public class customerMenu {

    
    public static int customerMenu(char mainMenuOption) {

        int a = userInput.intInput("\"Type one of the options below:\n" +
                "1. Rent a game\n" +
                "2. Return a game\n" +
                "3. Return to Main Menu\n");



        switch (a) {
            case 1 :
                customerMenuOption.rentGame();
                break;

            case 2 :
                customerMenuOption.returnGame();
                break;

            case 3:
                Menu.menu();
                break;

            default:
        }

        return a;
    }
}
