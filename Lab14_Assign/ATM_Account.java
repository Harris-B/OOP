package l14_assign;
import java.io.Serializable;

class ATM_account implements Serializable{
    
    private String accountNumber;
    private int balance;
    
    public ATM_account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "ATM_Account{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}' + "\n";
    }
}
    

