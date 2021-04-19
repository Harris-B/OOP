package l8ass2;
public class computer {
    private int wordSize;
    private int memorySize;
    private int storageSize;
    private int speed;
    
    // default constructor 
    computer(){
        wordSize=12;
        memorySize=2;
        storageSize=128;
        speed=120;
    }
    //constructor to initialize
    computer(int w, int m, int s, int sp){
        wordSize=w;
        memorySize=m;
        storageSize=s;
        speed=sp;
    }
    //display func
    void display(){
        System.out.println("Computer Specs: ");
        System.out.println("Word size: "+wordSize+" Bits"+"\nMemory size: "+memorySize+"MBs"+"\nStorage size: "+storageSize+"MBs"+"\nSpeed: "+speed+"MHz");
    }
}
