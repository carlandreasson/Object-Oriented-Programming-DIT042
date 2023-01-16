package Employee;

import Utilities.userInput;

public class removeCustomer {
        public static void customer(){
            int removeCustomerID = userInput.intInput("Enter customer ID of the game you want to remove ");
                if (registerCustomer.arrayCustomer[removeCustomerID]!=null ) {
                    registerCustomer.arrayCustomer[removeCustomerID] = null;
                    System.out.println("Customer is removed");
                } else {
                    System.out.println("Enter a valid customer ID number");
                    removeCustomer.customer();
                }
            }

        }
