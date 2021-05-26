package l11_as2;
//interface
interface shape{
    public double area(); //method
}

class circle implements shape{
//attributes
    private int radius;
//constructor
   public circle(){
       radius=7;
   }
@Override
    public double area(){  
       return 2*Math.PI*radius;
    }    
}

class rectangle implements shape{
//attributes
    private int length;
    private int width;
//constructor
   public rectangle(){
       length=5;
       width=2;
   }
    @Override
    public double area(){  
       return length*width;
    }    
}

class triangle implements shape{
//attributes
    private int bredth;
    private int height;
//constructor
   public triangle(){
       bredth=9;
       height=3;
   }
    @Override
    public double area(){  
       return (bredth*height)/2;
    }    
}
public class L11_As2 {
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println("area of circle = "+c1.area());
        
        rectangle r1 = new rectangle();
        System.out.println("area of rectangle = "+r1.area());
        
        triangle t1 = new triangle();
        System.out.println("area of triangle = "+t1.area());
    }
    
}
