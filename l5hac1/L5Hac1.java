package l5hac1;
/*
Create a class ― Distance‖ with two constructors (no argument, and two argument), two data
members ( feet and inches) . Create setter, getter and display method. Create a method that
adds two Distance Objects and returns the added Distance Object.
*/
public class L5Hac1 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.setFeet(5);
        d1.setInches(2);
        d1.add();
        d1.display();        
        
        Distance d2 = new Distance(8,8);
        d2.add();
        d2.display();
    }
    
}
