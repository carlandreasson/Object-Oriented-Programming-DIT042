package Menus;

import Utilities.userInput;

import java.util.Scanner;

public class Menu {

        public static void menu()  {


        String inputUser = userInput.stringInput("Welcome to DART, your good old game rental system. \n" +
                "The competition has no steam to keep up! \n" +
                "Please specify your role by entering on of the \n" +
                "options given: \n" +
                "1. Enter M for Manager \n" +
                "2. Enter E for Employee \n" +
                "3. Enter C for Customer \n" +
                "4. Enter X to exit system");


        switch (inputUser) {
            case "E":
                employeeMenu.employeeMenu("E");
                break;

            case "C":
                customerMenu.customerMenu('C');
                break;

            case "M":
                managerMenu.managerMenu();
                break;

            case "X":
                userInput.closeScanner(); //closes scanner then exits
                System.exit(0);
                break;

            default:
                System.out.println("Please enter a valid option");

        }

    }
}

