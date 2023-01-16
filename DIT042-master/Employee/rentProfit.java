package Employee;

public class rentProfit {
    public static void rentProfit(int gameID, long rentedDays) {
            int rentFee=registerGame.arrayGames[gameID].getDailyRentFee();
            long price = rentedDays * rentFee; //Byt rentFee till objekt som det blir av game ID
            long totalRentProfit=0;            // Byt rentDays till dagar emellan grejjen
            totalRentProfit=totalRentProfit+price;
        System.out.println("Rent profit for "+ gameID+" is "+price);
        System.out.println(("Tjänade pengar tutsi!!!! "+ totalRentProfit));
    }
}