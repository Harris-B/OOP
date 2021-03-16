package l4hac2;
public class L4Hac2 {
    public static void main(String[] args) {
        account ac1 = new account();
            ac1.setBalance(41000);
            ac1.setdeposit(100);
            ac1.setWithdraw(200);
            ac1.display();


        account ac2 = new account(ac1.getBalance(),1000,200);
            ac2.display();
    }
    
}
