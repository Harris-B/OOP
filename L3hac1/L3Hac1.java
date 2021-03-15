package l3hac1;
class circle{
    private int radius;
    
    // contructor 1
    public circle(){
        radius=5;
    }
    //constructor 2 /argumented
    public circle(int x,int y){
        this.radius=x;
    }
    //method
    public int calculateCir(){
        return (int) (2*3.14*radius);
    }
    
    }
public class L3Hac1 {
    public static void main(String[] args) {
        circle c1=new circle();
        System.out.println(c1.calculateCir());
        
    }
    
}
