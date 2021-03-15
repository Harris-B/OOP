package l4ac2;
public class Rectangle {
    private int length;
    private int width;
//constructor
public Rectangle(){
length = 5; width = 2;
}
//argumented constructor
public Rectangle(int l, int w){
length = l; width = w;
}
//method
public void setLength(int l) //sets the value of length
{
length = l;
}
//method
public void setWidth(int w) //sets the value of width
{
width = w;
}
//method
public int getLength() //gets the value of length
{
return length;
}
public int getWidth() //gets the value of width
{
return width;
}
public int area(){
return (length*width);
}

}
