package l3ac3;
public class Point {
//instance variables
    private int x;
    private int y;
// constructor # 1
    public Point(){
    x=1;
    y=2;
}
// constructor #2
    public Point(int a, int b){
    x=a;
    y=b;
}
//display function
    public void display(){
    System.out.println("x coordinate = "+x+" y coordinate = "+y);
}
//move function
public void movePoint(int a , int b){
    x=x+a;
    y=y+b;
    System.out.println("x coordinate after moving = "+x+" y coordinate after moving ="+y);
}

}
