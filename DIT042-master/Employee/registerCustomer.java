package Employee;

import Utilities.userID;

public class registerCustomer {
        public static int maxCustomers = 100;
        public static customerObject[] arrayCustomer = new customerObject[maxCustomers];

        public static void registerCustomer(String customerName){
            System.out.println(customerName);
            int customerID = userID.rint2();
            System.out.println(customerID);
            customerObject customer = new customerObject(customerID, customerName);
            arrayCustomer[customerID]=customer;
            System.out.println("The customer with customerID " + customerID+ " is created");

        }


    }
