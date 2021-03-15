package runner;
public class Reactangle {
    public int length, width;
    public int calculateArea(){
        return (length*width);
    }
    public void display(){
        System.out.println("Area is: "+calculateArea ( ));
    }
}