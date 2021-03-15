package l3hac3;
class distance{
    //data members
    private int feet;
    private int inches;
    //contructor 1
    public distance(){
        feet=5;
        inches=2;
    }
    //constructor 2
    public distance(int feet, int inches){
    this.feet=feet;
    this.inches=inches;
}
    //method
    public void display(){
        System.out.println("Distance is "+feet+" feet and "+inches+" inches.");
    }
}//main class
public class L3Hac3 {
    public static void main(String[] args) {
        distance d1 =new distance();
        d1.display();
        // using argumented constructor
        distance d=new distance(6,5);
        d.display();
    }
    
}
