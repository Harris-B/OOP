package l11_as3;
import java.util.*;
// the required interface
interface GeometricShape {
    double area1();
}
//rectangle class
class Rectangle implements GeometricShape {
    double length;
    double width;    
    //constructor
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    @Override
    public double area1() {
        return this.length * this.width;
    }
}
// circle class
class Circle implements GeometricShape {
    double radius;   
    //constructor
    Circle(double r) {
        this.radius = r;
    }
    @Override
    public double area1() {
        return 3.14*this.radius*this.radius;
    }
}
// triangle class
class Triangle implements GeometricShape {
    double base;
    double height;
    //constructor
    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
    @Override
    public double area1() {
        return 0.5*this.base*this.height;
    }
}
// CalculateAreas class
class CalculateAreas {
    // the required function
    static double[] func(GeometricShape[] shapes) {
        double[] ans = new double[shapes.length];
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null)
                ans[i] = shapes[i].area1();
        }
        return ans;
    }
}
public class L11_As3 {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[5];
            shapes[0] = new Rectangle(1.2, 3.4);
            shapes[1] = new Triangle(1.2, 1.4);
            shapes[2] = new Circle(4.2);
            shapes[3] = new Triangle(4,5);
            shapes[4] = new Circle(5);
            
            double areas[] = CalculateAreas.func(shapes);
            for(double a: areas) {
                System.out.println(a);
    }
    }    
}
