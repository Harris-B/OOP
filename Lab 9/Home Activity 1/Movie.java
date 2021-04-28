package l9hac1;
import java.util.Scanner;
public class Movie {
    String MPAArating;
    int IDNumber;
    String movieTitle;
    
// default constructor
    Movie(){
    this.MPAArating = "PG-13";
    this.IDNumber = 147;
    this.movieTitle = "SpiderMan";
    }
//getter and setter methods
    public String getMPAArating() {
        return MPAArating;
    }
    public void setMPAArating(String MPAArating) {
        this.MPAArating = MPAArating;
    }
    public int getIDNumber() {
        return IDNumber;
    }
    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
// method to check if movies are equal
    public boolean equal(Movie m){
        if(this.IDNumber==m.IDNumber)
            return true;
        else
            return false;
    }
 //method to calculate late fee
    public void  calcLateFees(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days movie was late ?");
        int days = sc.nextInt();
        int fine = 0;
        for (int i = 0; i < days; i++) {
            fine+=2;
        }
        System.out.println("Late fee for "+days+" days is:"+fine+"$");
        
    }
//display method
    void display(){
        System.out.println("Movie: "+movieTitle+"\nMPAA rating: "+MPAArating+"\nID number: "+IDNumber);
    }
}
