package l5ass1;
public class Fraction {
    private double a;
    private double b;
//constructor 1
    public Fraction(){
    a=5;
    b=10;
    }
//constructor 2
    public Fraction(int x, int y){
    this.a=x;
    this.b=y;
    }
// set get functions
    public void setA(int a){
    this.a=a;
    }
    public double getA(){
    return a;
    }
    public void setB(int b){
    this.b=b;
    }
    public double getB(){
    return b;
    }
// ratio
    public double ratio(){
    return a/b;
    }
// equals method
    public boolean equals(Fraction f){
        if(this.a/this.b==f.a/f.b){
            return true;
        }
    else{
            return false;
}       
}
//display method
    public void display(){
        System.out.println("fraction is: "+ratio());
//        System.out.println(this.equals());
    }
}