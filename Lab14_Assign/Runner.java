package l14_assign;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Runner {
    public static void main(String[] args) {
               ATM_Account a1 = new ATM_Account("123456789", 100);
        ATM_Account a2 = new ATM_Account("1122334455", 100);
        ATM_Account a3 = new ATM_Account("987654321", 100);
        ATM_Account a4 = new ATM_Account("998877665544", 100);
        ATM_Account a5 = new ATM_Account("9876512344", 100);
        ATM_Account a6 = new ATM_Account("1928374650", 100);
        ATM_Account a7 = new ATM_Account("123987560", 100);
        ATM_Account a8 = new ATM_Account("23456789011", 100);
        ATM_Account a9 = new ATM_Account("098765432100", 100);
        ATM_Account a10 = new ATM_Account("99876512340", 100);
        atmAccountArray[0] = a1;
        atmAccountArray[1] = a2;
        atmAccountArray[2] = a3;
        atmAccountArray[3] = a4;
        atmAccountArray[4] = a5;
        atmAccountArray[5] = a6;
        atmAccountArray[6] = a7;
        atmAccountArray[7] = a8;
        atmAccountArray[8] = a9;
        atmAccountArray[9] = a10;
        
        // Write all 10 objects into a file
        writer = new BufferedWriter(new FileWriter("C:Account.txt"));
        writer.write("The Initial Accounts are:----> \n");
        writer.write(a1.toString());
        writer.write(a2.toString());
        writer.write(a3.toString());
        writer.write(a4.toString());
        writer.write(a5.toString());
        writer.write(a6.toString());
        writer.write(a7.toString());
        writer.write(a8.toString());
        writer.write(a9.toString());
        writer.write(a10.toString());
    
        ATM_Account_main obj1 = new ATM_Account_main();
        obj1.balanceInquiry("123456789");
        obj1.withdraw("123456789");
        obj1.deposit("123456789");
        obj1.transfer("123456789","99876512340");
        
        obj1.deposit("1122334455");
        obj1.deposit("987654321");
        obj1.deposit("987654321123");
        obj1.deposit("123987560");
        obj1.deposit("99876512340");
        obj1.transfer("99876512340","987654321");
        obj1.transfer("99876512340","098765432100");
        
        writer.write("The Final Accounts Accounts are:----> \n");
        writer.write(a1.toString());
        writer.write(a2.toString());
        writer.write(a3.toString());
        writer.write(a4.toString());
        writer.write(a5.toString());
        writer.write(a6.toString());
        writer.write(a7.toString());
        writer.write(a8.toString());
        writer.write(a9.toString());
        writer.write(a10.toString());
        writer.close();
    }
    
}
