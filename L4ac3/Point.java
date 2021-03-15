package l4ac3;
public class Point {
    private int x;
    private int y;
//constructor
public Point(){
    x=0;
    y=0;
}
//argumented constructor
public Point(int a, int b){
    x=a;
    y=b;
}
//method
public void setX(int a){
    x=a;
}
// set and get method
public void setY(int b){
    y=b;
}
public int getX(){
    return x;
}
public int getY(){
    return y;
}
//method
public void display(){
    System.out.println("x coordinate = "+x+" y coordinate = "+y);
}
public void movePoint(int a , int b){
    x=x+a;
    y=y+b;
System.out.println("x coordinate after moving = "+x+" y coordinate after moving ="+y);
}
}
