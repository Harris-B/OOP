package l9hac2;
public class VerifiedSimple extends Simple{
//override functions
    @Override
    void add(){
        if(num1>0&&num2>0){  //checks if both numbers are greater than 0
            System.out.println("Sum: "+num1+num2);
        }
        else{
            System.out.println("error");
        }
    }
    @Override
    void sub(){
        if(num1>0&&num2>0){
            System.out.println("Sub: "+(num1-num2));
        }
        else{
            System.out.println("error");
        }
    }
    @Override
    void mul(){
        if(num1>0&&num2>0){
            System.out.println("Mul: "+num1*num2);
        }
        else{
            System.out.println("error");
        }
    }
    @Override
    void div(){
        if(num1>0&&num2>0){
            System.out.println("Div: "+num1/num2);
        }
        else{
            System.out.println("error");
        }
    }
}
