package l3ass2;
public class time {
    private int hrs;
    private int min;
    private int sec;
//constructor    
public time(){
    hrs=5;
    min=8;
    sec=10;
}
// argumented constructor
public time(int hours, int minutes, int seconds){
    this.hrs=hours;
    this.min=minutes;
    this.sec=seconds;
}
//method
public void setHours(int hours){
    this.hrs=hours;
}
//method
public void setMinutes(int minutes){
    this.min=minutes;
}
//method
public void setSeconds(int seconds){
    this.sec=seconds;
}
//method
public void display(){
    System.out.println("Hours: "+hrs+"\nMinutes: "+min+"\nSeconds: "+sec);
}
}
