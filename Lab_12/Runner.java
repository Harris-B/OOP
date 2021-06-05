/*
Convert the program made in the lab to use the built-in ArrayLists

Your code should have both the implementations:
The one made in the lab
Updated code with the ArrayList implementation
Comment out all the Array based code written it the lab, do not delete it, also make sure that when you upgrade your code to use ArrayLists, do not leave any variable or method uncommented that belongs to the Array based implementation, failing to do so will result in negative marking.

Addtionally, you can annotate the ArrayList with the type of the interface we developed in the lab for the said activity.
*/
package l12_assign;
public class Runner {
    public static void main(String[] args) {
//lab part
        /*public class Runner { 
    public static void main(String[] args){
            HumanResource h1 = new HumanResource();
            h1.add(new student("ahmed","096"));
            h1.add(new teacher("haris", "060"));
            h1.delete(new teacher ("haris","060"));
            System.out.println(h1);
    }
}*/
            HumanResource HR = new HumanResource();                   
            HR.add(new student("Haris","060"));
            HR.add(new teacher("umar", "047"));
            System.out.println(HR);
            System.out.println("-----For removing-----");
            System.out.println(HR.delete(new teacher("Ahmed","786")));
            System.out.println(HR);
    }
    
}
