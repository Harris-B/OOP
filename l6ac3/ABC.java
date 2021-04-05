package l6ac3;
public class ABC {
    public static int i ;
    public String s; //non static
//Static method
 public static void displayStatic(){
 System.out.println("i:"+i); // we cannot access non static data in this static method  
 }
//displaying using non static method
 public void display() {          
 System.out.println("i:"+i);
 System.out.println("s:"+s);
 }

}
