package l4hac2;
public class account {
    //instances
    private int balance;
    private int withdraw;
    private int deposit;
    //constructor
    public account(){
        balance = 100;
    }
    //argumented constructor for second account
    public account(int a,int b,int c){
        balance = a;
        deposit = b;
        withdraw = c;
    }
// setter and getter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setWithdraw(int w){
        withdraw = w;
    } 
    public int getWithdraw() {
        return withdraw;
    }
    public  void setdeposit(int d){
        deposit = d;
    }
    public int getDeposit() {
        return deposit;
    }
    // method
    public void display(){
        balance = balance+deposit-withdraw;
        System.out.println("your remaining balance is: "+balance);
    }
    }

