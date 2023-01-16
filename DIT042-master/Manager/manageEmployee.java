package Manager;

import Menus.Menu;
import  Menus.managerMenu;
import Utilities.userID;
import Utilities.userInput;

public class manageEmployee {
    public static int maxEmployees = 20;
    public static employee[] employee = new employee[maxEmployees];
        public static void addEmployee(){
            String name=userInput.stringInput("Enter name of the employee to be added:");
            int birthYear=userInput.intInput("Enter birth year of the employee YYYY:");
            double salary= userInput.doubleInput("Enter salary for the employee:");
            int ID= userID.checkID(maxEmployees);
            if(ID<0){
                System.out.println("There was a problem with ID-generation.\n Returning to main menu...");
                Menu.menu();
            }else{
                employee[ID]=new employee(ID,name,birthYear,salary);
                System.out.println("Employee created successfully!");
                managerMenu.passwordChecked();
            }
        }
        public static void viewEmployee (){
            System.out.println("This is all your employees:");
            double totalPay=0;
            for(int i=0;i<maxEmployees;i++){
                if (employee[i]!=null){

                    System.out.println(employee[i]);
                    totalPay+=employee[i].getSalary();
                }
            }
            System.out.println("Total salary costs: "+totalPay+" SEK");
        managerMenu.passwordChecked();
        }
    public static void removeEmployee(int empID){
            if (empID>=maxEmployees) {
                System.out.println("Employee with ID: "+ empID + " not found.");
                managerMenu.passwordChecked();
                }
            else if (employee[empID]==null) {
                System.out.println("Employee with ID: "+ empID + " not found.");
                managerMenu.passwordChecked();
            }
            else{
                employee[empID]=null;
                System.out.println("Employee removed successfully.");
                managerMenu.passwordChecked();
            }

    }



}
