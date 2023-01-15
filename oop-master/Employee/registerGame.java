package Employee;

import Utilities.userID;
import Utilities.userInput;

public class registerGame {
    public static int maxGames = 100;
    public static gameObject[] arrayGames = new gameObject[maxGames];

    public static void registerGame(String employeeMenuOption){
        int gameID = userID.rint2();
        System.out.println("Game ID is " + gameID);

        String gameName = userInput.stringInput ("Enter name of game:");
        String gameGenre = userInput.stringInput("Enter genre of game:");
        int gameDailyRentFee = userInput.intInput("Enter daily rent fee of game:");
        String gameRentStatus = userInput.stringInput("Enter rent status of game");

        gameObject game = new gameObject(gameID, gameName, gameGenre,  gameDailyRentFee, gameRentStatus);
        game = arrayGames[gameID];
        System.out.println("The game with gameID" + arrayGames[gameID] + " is created");
    }

}
