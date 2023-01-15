package Employee;

import Utilities.userInput;

public class removeGame {

    public static void Game(String employeeMenu){

        int removeGameID = userInput.intInput("Enter GameID of the game you want to remove ");
        if (removeGameID < registerGame.maxGames) {  //This just say that the value has to be less than 100. Not in the gameID actually exists.
        registerGame.arrayGames[removeGameID] = null;
            System.out.println("Game is removed");
        }
        else{
                System.out.println("Enter a valid gameID number");
                removeGame.Game("");
            }

    }
}

