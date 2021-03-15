package l3ac2;
public class Rectangle {
    public int length, width;
//constructor
public Rectangle(){
    length = 5; 
    width = 2;
}
public Rectangle(int l, int w){   // argumented constructor
    length = l; 
    width = w;
}
//method
public int calculateArea (){
    return (length*width);
} 
}
