package l9ass3;
import java.util.Scanner;
public class L9Ass3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Select Student level...\n1 for phd \n2 for graduate");
        int userChoice=sc.nextInt();
        
        if(userChoice==1){
            phdStudent p1 = new phdStudent();
            p1.takeExam();       
        }
        else if(userChoice==2) {
           gradStudent g1 = new gradStudent();
           g1.takeExam();       
        } 
        else{
            System.out.println("invalid entry");
        }

    }
    
}
