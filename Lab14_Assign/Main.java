package l14_assign; 
import java.io.*;

class Main {
    private static ATM_account[] atmAccountArray = new ATM_account[10];
    private static BufferedWriter writer;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void balanceInquiry (String accountNumber){
        boolean isFound=false;
        for (int i=0;i<10;i++){
            if (atmAccountArray[i].getAccountNumber().equalsIgnoreCase(accountNumber)){
                isFound=true;
                System.out.println("The Account Balance is: "+ atmAccountArray[i].getBalance());
                break;
            }
        }
        if(!isFound)
            System.out.println("No such Account Number Found");
    }
    
    public void withdraw(String accountNumber) throws IOException{
        boolean isFound=false;
        int withdrawAmount;
        for (int i=0;i<10;i++) {
            if (atmAccountArray[i].getAccountNumber().equalsIgnoreCase(accountNumber)) {
                isFound = true;
                System.out.println("enter Withdrawl Amount");
                withdrawAmount = Integer.parseInt(br.readLine());
                if (atmAccountArray[i].getBalance() >= withdrawAmount)
                    atmAccountArray[i].setBalance(atmAccountArray[i].getBalance() - withdrawAmount);
                else
                    System.out.println("not enough balance to withdraw");
                break;
            }
        }
        if(!isFound)
            System.out.println("No Account Number Found");
    }
    
    public void deposit(String accountNumber) throws Exception{
        boolean isFound=false;
        int depositAmount;
        for (int i=0;i<10;i++) {
            if (atmAccountArray[i].getAccountNumber().equalsIgnoreCase(accountNumber)) {
                isFound = true;
                System.out.println(" enter Deposit Amount");
                depositAmount = Integer.parseInt(br.readLine());
                if (depositAmount < 0)
                    System.out.println("You cannot enter Negative Amount");
                else
                    atmAccountArray[i].setBalance(atmAccountArray[i].getBalance() + depositAmount);
                
                break;
            }
        }
        if(!isFound)
            System.out.println("No Account Number Found");
    }
    
    public void transfer(String accountNumberFrom, String accountNumberTo) throws Exception{
        int fromPosition=-1, toPosition=-1;
        int transferAmount;
        for (int i=0;i<10;i++){
            if (atmAccountArray[i].getAccountNumber().equalsIgnoreCase(accountNumberFrom)) {
                fromPosition = i;
                break;
            }
        }
        for (int i=0;i<10;i++){
            if (atmAccountArray[i].getAccountNumber().equalsIgnoreCase(accountNumberTo)) {
                toPosition = i;
                break;
            }
        }
        
        if (fromPosition !=-1 && toPosition !=-1){
            System.out.println("enter Amount to transfer");
            transferAmount = Integer.parseInt(br.readLine());
            if (atmAccountArray[fromPosition].getBalance() >= transferAmount) {
                atmAccountArray[fromPosition].setBalance(atmAccountArray[fromPosition].getBalance() - transferAmount);
                atmAccountArray[toPosition].setBalance(atmAccountArray[toPosition].getBalance() + transferAmount);
            }else
                System.out.println("insufficient funds");
        }
    }
    
}
