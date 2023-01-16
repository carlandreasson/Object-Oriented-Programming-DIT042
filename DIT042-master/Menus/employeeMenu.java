package Menus;

import Utilities.userInput;
import Employee.registerGame;
import Employee.removeGame;
import Employee.registerCustomer;
import Employee.removeCustomer;
import Employee.dagarMellan;
import Employee.rentProfit;
import java.util.Scanner;

public class employeeMenu {

    public static int employeeMenu(String mainMenuOption){
        String password = userInput.stringInput("Please enter Password:");
        String correctPassword = "password123";
        if (password.equals(correctPassword)) {
            System.out.println("Employee Screen - Type one of the options below:" +
                    "\n1. Register a game" +
                    "\n2. Remove a game" +
                    "\n3. Register a customer" +
                    "\n4. Remove a customer" +
                    "\n5. Show total rent profit" +
                    "\n6. View all games" +
                    "\n7. Return to Main Menu");

            int employeeMenuOption = userInput.intInput("");
            switch (employeeMenuOption) {
                case 1:
                    registerGame.registerGame("");
                    break;

                case 2:
                    removeGame.Game("");
                    break;

                case 3:
                    registerCustomer.registerCustomer(userInput.stringInput ("Enter name of customer:"));
                    break;

                case 4:
                    removeCustomer.customer();
                    break;

                case 5:
                    System.out.println("Show total rent profit");
                    rentProfit.rentProfit(userInput.intInput("Game ID"), dagarMellan.olof_krister()); //rented days skall komma från Felix kod
                    break;

                case 6:
                    System.out.println("View all games");
                    break;
                case 7:
                    Menu.menu();
                    break;

                default:
                    System.out.print("Please enter a valid option: ");
                    employeeMenu.employeeMenu("");
            }

        }
                else {
                 System.out.println("Incorrect Password");
                 employeeMenu.employeeMenu("");
        }
            return employeeMenu("");


 }
}
