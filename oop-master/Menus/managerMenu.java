package Menus;

import Manager.manageEmployee;
import Utilities.userInput;

public class managerMenu {
        public static void managerMenu() {
            String password = userInput.stringInput("Please enter Password:");
            String correctPassword = "admin123";
            if (password.equals(correctPassword)) {
                managerMenu.passwordChecked();
            } else {
                System.out.println("Incorrect Password");
                Menu.menu();
            }
        }
        public static void passwordChecked() {
            int inputUser = userInput.intInput("Manager Screen - Type one of the options below:" +
                    "\n1. Add an employee"+
                    "\n2. View all employees & salary cost"+
                    "\n3. Remove an employee"+
                    "\n4. Return to Main Menu");
            userInput.stringInput("");
            switch (inputUser) {
                case 1 :
                        manageEmployee.addEmployee();
                        break;
                case 2 :
                        manageEmployee.viewEmployee();
                        break;
                case 3 :
                        int ID = userInput.intInput("Enter the ID of the employee you want to remove");
                        manageEmployee.removeEmployee(ID);
                        break;
                case 4:
                        Menu.menu();
                        break;
                default: {
                    System.out.println("Please enter a valid number");
                    passwordChecked();
                }
            }
        }
    }