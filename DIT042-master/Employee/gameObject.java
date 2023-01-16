package Employee;

public class gameObject {
    public int gameID;
    public String name;
    public String genre;
    private int dailyRentFee;
    public String rentStatus;

    public gameObject(){

    }
    public gameObject (int gameID, String name, String genre, int dailyRentFee, String rentStatus){
        this.gameID=gameID;
        this.name=name;
        this.genre=genre;
        this.dailyRentFee=dailyRentFee;
        this.rentStatus=rentStatus;
    }
    public int getDailyRentFee(){
        return this.dailyRentFee;
    }
}
