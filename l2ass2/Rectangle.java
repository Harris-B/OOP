package l2ass2;
public class Rectangle {
    public int height;
    public int width;
    public String colour;
    public int Area;
    
    void display(){
        System.out.println(" Rectanlge's height:  " + height +" \n width: " + width +" \n Colour: " + colour);
        System.out.println(Area(width , height));
    }
    int Area(int height , int width){
        int Area = height*width;
        System.out.println("Area is : " + Area);
        return Area;
    }
}
