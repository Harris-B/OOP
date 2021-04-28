package l9ac2;
/*
The following activity explains the use of overriding for customizing the method of super
class.
The classes below include a CommisionEmployee class that has attributes of firstname,
lastName, SSN, grossSales, CommisionRate. It has a constructor to initialize, set and get
functions, and a function to display data members.
The other class BasePlusCommisionEmployee is inherited from CommisionEmployee. It has
additional attributes of Salary. It also has set and get functions and display function.
The Earning method is overridden in this example.
*/
public class L9Ac2 {
    public static void main(String[] args) {
        BasePlusCommEmployee b = new BasePlusCommEmployee("ali","ahmed", "25-kkn",100, 5.2, 25000);
        b.display();
        System.out.println("Earning of employee is: " + b.earnings());
    }
    
}
