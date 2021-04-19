package l8ass;
import java.util.Scanner;
public class L8Ass {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        System.out.println("Press 1 to select Book \n2 to select the Tape ");
        int selection=u.nextInt();
        
        if(selection==1){
        book b1 = new book();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Book Title--");
        b1.setTitle(sc.nextLine());
        System.out.println("Enter Book's Price--");
        b1.setPrice(sc.nextInt());
        System.out.println("Enter total NO.of pages--");
        b1.setPageCount(sc.nextInt());
        b1.display();
        }
        else{
        tape t1= new tape();
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Tape's title--");
        t1.setTitle(x.nextLine());
        System.out.println("Enter Tape's price--");
        t1.setPrice(x.nextInt());
        System.out.println("Enter tape's playing time in minutes--");
        t1.setPlayingTime(x.nextInt());
        t1.display();       
    }
    
}
}