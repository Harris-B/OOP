package l6hac1;
public class L6Hac1 {
    public static void main(String[] args) {
        SavingsAccount saver1=new SavingsAccount();
        SavingsAccount saver2=new SavingsAccount();
        
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        saver1.Display();
        System.out.println("------------------------------------------");
        saver2.Display();
    }
    
}
