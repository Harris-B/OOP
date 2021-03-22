package l5ac3;
public class Point {
    private int X;
    private int Y;
//constructor
public Point(){
    X = 5;
    Y = 6;
}
//argumented constructor
public Point(int a, int c){
    X = a;
    Y = c;
}
// setters and getters
public void setX (int a){
    X = a;
}
public int getX(){
    return X;
}
public void setY (int c){
    Y= c;
}
public int getY(){
    return Y;
}
//
public Point Add(Point Pa, Point Pb )
{
    Point p_new = new Point(X+ Pa.X + Pb.X, Y+ Pa.Y + Pb.Y);
    return p_new;
}
// method
public void display(){
System.out.println(X);
System.out.println(Y);
}

}
