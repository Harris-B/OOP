package l2ass1;
/**
 *
 * @author Haris
 */
import java.util.Scanner;
public class L2Ass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Car c1 = new Car();
        System.out.println("Enter Model : ");
        c1.model = in.nextLine();
        System.out.println("Enter Colour : ");
        c1.colour = in.nextLine();
        System.out.println("Enter Registration# : ");
        c1.reg_num = in.nextLine();
        c1.display();
        
        
        Car c2 = new Car();
        System.out.println("Enter Model : ");
        c2.model = in.nextLine();
        System.out.println("Enter Colour : ");
        c2.colour = in.nextLine();
        System.out.println("Enter Registration# : ");
        c2.reg_num = in.nextLine(); 
        c2.display();
        
        System.out.println("Enter 8 to move forwerd \nEnter 2 to reverse \nEnter 4 to open left door \nEnter 6 to open right door: ");
        c1.action = in.nextInt();
        c1.action(c1.action);
    }
        
    }
    

