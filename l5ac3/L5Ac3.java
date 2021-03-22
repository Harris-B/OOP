//The following activity demonstrates the creation of a method that accepts two objects. 
package l5ac3;
public class L5Ac3 {
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point (30,40);
        Point p3 = new Point ();
        Point p4 = p1.Add(p2,p3);
        p4.display();

    }
    
}
