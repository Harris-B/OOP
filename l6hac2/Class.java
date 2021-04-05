package l6hac2;
public class Class {
    protected static int count=0;
    
    public Class(){
        count++;
        Class.display();
}
    public Class(int x){
        count++;
        Class.display();
}
    public static void display(){  
        System.out.println("i am an object");
    }
}
