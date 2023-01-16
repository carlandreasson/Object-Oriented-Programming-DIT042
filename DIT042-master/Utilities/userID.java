package Utilities;
import Manager.manageEmployee;
import java.security.SecureRandom;

//rint 2 för mellan 0-99 och rint 4 för 0-9999
//randomNumber för valfritt
public class userID {
    public static SecureRandom random = new SecureRandom();

    public static int randomNumber(int numberSize){ return random.nextInt(numberSize); }
    public static int rint2(){
        return random.nextInt(100);
    }
    public static int rint4(){
        return random.nextInt(10000);
    }
    public static void formatNumber(int numberSize,int number,String generationMessage){
        if(numberSize==2){
            String formatnumber = String.format("%02d",number);
            System.out.println(generationMessage+" "+formatnumber);
        }else if(numberSize==4){
            String formatnumber = String.format("%04d",number);
            System.out.println(generationMessage+" "+formatnumber);
        }else{
            System.out.println("ERROR: invalid length");
        }

    }
    public static int checkID(int maxObjects){ //checks so theres a free spot for adding another employee used for manager only
        int returnID = -1;
        for (int i = 0; i <= maxObjects * 5; i++) {
            int numberID = userID.randomNumber(maxObjects);
            if (manageEmployee.employee[numberID] == null) {
                i = maxObjects * 6;
                returnID = numberID;
            }
        }
        return returnID;
    }
}
