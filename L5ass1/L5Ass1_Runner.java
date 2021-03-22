package l5ass1;
/*
Define a class called Fraction. This class is used to represent a ratio of two integers. Create
two constructors, set, get and display function. Include an additional method, equals, that
takes as input another Fraction and returns true if the two fractions are identical and false if
they are not.
*/
public class L5Ass1 {
    public static void main(String[] args) {
        
        Fraction f1 = new Fraction();
        f1.setA(5);
        f1.setB(10);
        f1.ratio();
        f1.display();
              
        Fraction f2 =new Fraction(50,30);
        f2.ratio();
        f2.display();
        
        if(f1.equals(f2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
   


    }
    
}
