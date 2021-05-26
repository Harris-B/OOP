package l11_as1;
//interface
interface shape{
    public double area(); //method
}
class GeometricShape implements shape{
//attributes
    private int length;
    private int width;
//constructor
   public GeometricShape(){
       length=5;
       width=2;
   }
    @Override
    public double area(){  
       return 2*(length+width);
    }    
}
public class L11_As1 {
    public static void main(String[] args) {
        GeometricShape gs = new GeometricShape();
        System.out.println("Area: "+gs.area());
    }
    
}
