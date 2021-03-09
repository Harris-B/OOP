package l2ass2;
import java.util.Scanner;
public class L2Ass2 {
    public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
      Rectangle r1;
      r1 = new Rectangle();
      System.out .println("Enter height : ");
      r1.height = in.nextInt();
      System.out.println("Enter width : ");
      r1.width = in.nextInt();
      
      in.nextLine();
      
      System.out.println("Enter colour : ");
      r1.colour = in.next();
      r1.display();
      r1.Area(r1.height , r1.width);
    }
    
}
