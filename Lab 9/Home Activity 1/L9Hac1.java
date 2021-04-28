package l9hac1;

import java.util.Scanner;

public class L9Hac1 {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.display();
        
        Scanner sc = new Scanner(System.in);
        int userChoice;
        System.out.println("Select genre of Movie..\n1 for action \n2 for Comedy \n3 for Drama");
        userChoice=sc.nextInt();
        
        if(userChoice==1){
            Action a1 = new Action();
            a1.calcLateFees();
            
        }
        else if(userChoice==2){
            Comedy c1 = new Comedy();
            c1.calcLateFees();
        }
        else if(userChoice==3){
            Drama d1 = new Drama();
            d1.calcLateFees();
        }
        else{
            System.out.println("Enter valid selection");
        }
    }
    
}
