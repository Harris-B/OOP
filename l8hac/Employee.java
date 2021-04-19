package l8hac;
public class Employee extends Person{
    private int office;
    private int salary;
    private String dateHired;
    
    Employee(){
        super();
        office=7;
        salary=50000;
        dateHired="10/1/2007";
    }
        public void display(){
        super.display();
        System.out.println("\nOffice No: "+office+"\nSalary: "+salary+"\nDate Hired: "+dateHired);
    }
}
