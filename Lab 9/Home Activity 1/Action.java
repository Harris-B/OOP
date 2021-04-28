package l9hac1;

import java.util.Scanner;

public class Action extends Movie{
    
        @Override
        public void  calcLateFees(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days movie was late ?");
        int days = sc.nextInt();
        int fine = 0;
        for (int i = 0; i < days; i++) {
            fine+=3;
        }
         System.out.println("Late fee for "+days+" days is:"+fine+"$");
        
    }
    
}
