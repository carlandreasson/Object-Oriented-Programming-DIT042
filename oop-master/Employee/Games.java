package Employee;

public class Games {

    int ID;
    String title;
    String genre;
    double rentFee;
    boolean rentedOut = false;


    public Games(int ID, String title, String genre, double rentFee){
        this.rentedOut=rentedOut;
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.rentFee = rentFee;
    }
    public String toString(){
        return "ID: "+this.ID+" Title: "+ this.title+" Genre: "+ this.genre+" Rent Fee: "+ this.rentFee+ this.rentedOut;

    }

}
