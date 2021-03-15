package l3hac2;
class accountClass{
    public int balance;
    //constructor 1
    public accountClass(){
        balance=50;
}
    //constructor 2 / argumented
    public accountClass(int x, int y){
        this.balance=x;
    }
    // method
    public int deposit(int d){
        return d=balance+5;
    }
    //method
    public int withdraw(int w){
        return w=balance-5;
    }
}//main class
public class L3Hac2 {
    public static void main(String[] args) {
        accountClass ac1 = new accountClass();
        ac1.balance=500;
        System.out.println("Balance is: "+ac1.balance);
        // using argumented constructor
        System.out.println("Balance after deposit is: "+ac1.deposit(5));
        System.out.println("Balance after withdrawl is: "+ac1.withdraw(5));
    }
    
}
