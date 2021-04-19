package l8ass2;
public class laptop extends computer {
    private int length;
    private int width;
    private int height;
    private int weight;
    
    //default constructor
    laptop(){
        length=2;
        width=5;
        height=3;
        weight=10;
    }
    //constructor to initialize
    laptop(int l , int w , int h , int mg){
        length=l;
        width=w;
        height=h;
        weight=mg;
    }
    //display func
    void display(){
        super.display();
        System.out.println(" ");
        System.out.println("Computer Dimensions:");
        System.out.println("length: "+length+"\nWidth: "+width+"\nHeight: "+height+"\nWeight: "+weight);
    }
}
