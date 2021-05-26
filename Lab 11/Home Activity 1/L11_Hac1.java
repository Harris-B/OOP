package l11_hac1;
/*
Create an interface EnhancedShape that extends Shape and also requires a method public double
perimeter( ) to be implemented by any class that uses the interface.

*/    
class shape{
    int length;
    int width;
    
    public shape(){
        this.length=5;
        this.width=12;
    }
}
 interface EnhancedShape{
    public double perimeter();
}
 
class newShape extends shape implements EnhancedShape{

    @Override
    public double perimeter(){
        return 2*(length+width);
    }
    }
public class L11_Hac1 {
    public static void main(String[] args) {
        newShape ns = new newShape();
        System.out.println("Perimeter: "+ns.perimeter());
    }
    
}
