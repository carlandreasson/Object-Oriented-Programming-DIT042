package Customer;
import Employee.Games;
public class customerMenuOption {

    public static int maxGames = 20;
    public static Games[] game = new Games[maxGames];
    public static void rentGame() {
        game[0] = new Games(0,"Grand Theft Auto","Freeroam",49.50);
        game[1] = new Games(1,"Fall Guys","Freeroam",49.50);
        game[2] = new Games(2,"Counter Strike 1.6","Freeroam",49.50);
        game[3] = new Games(3,"FIFA 98","Freeroam",49.50);
        game[4] = new Games(4,"Super Mario 64","Freeroam",49.50);
        game[5] = new Games(5,"World of Warcraft","Freeroam",49.50);
        game[6] = new Games(6,"The SIMS","Freeroam",49.50);
        game[7] = new Games(7,"Rollercoaster Tycoon","Freeroam",49.50);
        game[8] = new Games(8,"RuneScape","Freeroam",49.50);
        game[10] = new Games(9,"Tibia","Freeroam",49.50);
        game[10] = new Games(10,"DOOM","Freeroam",49.50);
        game[11] = new Games(11,"Super Smash Bros","Freeroam",49.50);
        game[12] = new Games(12,"Defense of the Ancients 2","Freeroam",49.50);
        game[13] = new Games(13,"League of Legends","Freeroam",49.50);
        game[14] = new Games(14,"Diablo 3","Freeroam",49.50);
        for (int i = 0; i < maxGames;i++){
            if(game[i]==null){

            }else{
                System.out.println(game[i]);
            }
        }


        }

    public static void returnGame(){


    }
}
