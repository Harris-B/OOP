package l5hac1;
public class Distance {
    private int feet;
    private int inches;
//constructor
public Distance(){
    feet=5;
    inches=2;
}    
//argumented constructor
public Distance(int f, int i){
    feet=f;
    inches=i;
}
// setter and getter
public void setFeet(int feet){
    this.feet=feet;
}
public int getFeet(){
return feet;
}
public void setInches(int inches){
    this.inches=inches;
}
public int getInches(){
return inches;
}
//method
public int add(){
return feet+inches;
}

//method
public void display(){
    System.out.println("sum of two distance objects is: "+add());
}
}
