package l3ass2;
public class L3as2 {
      private int hrs;
    private int min;
    private int sec;
    
public L3as2(){
hrs=5;
min=8;
sec=10;
}

public L3as2(int hours, int minutes, int seconds){
    this.hrs=hours;
    this.min=minutes;
    this.sec=seconds;
}
public void setHours(int hours){
    this.hrs=hours;
}
public void setMinutes(int minutes){
    this.min=minutes;
}
public void setSeconds(int seconds){
    this.sec=seconds;
}
public void display(){
    System.out.println("Hours: "+hrs+"\nMinutes: "+min+"\nSeconds: "+sec);
}
}
