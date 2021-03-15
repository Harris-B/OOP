package l4ac1;
public class Circle {
    private int radius;
//constructor    
public Circle(){
radius=7;
}
//argumented constructor
public Circle(int r){
radius=r;
}
//method
public void setRadius(int r){
radius=r;
}
//method
public int getRadius(){
return radius;
}
//method
public void display(){
System.out.println("radius = "+radius);
}
//method
public void CalculateCircumfrance(){
double a=3.14*radius*radius;
System.out.println("Circumfrance = "+a);
}
}
