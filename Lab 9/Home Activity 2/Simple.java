package l9hac2;
public class Simple {
    int num1;
    int num2;
    //default const
    Simple(){
        this.num1=10;
        this.num2=5;
    }
    void add(){
        System.out.println(num1+num2);
    }
    void sub(){
        System.out.println((num1-num2));
    }
    void mul(){
        System.out.println(num1*num2);
    }
    void div(){
        System.out.println(num1/num2);
    }
}
