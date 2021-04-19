package l8hac;
public class Student extends Person{
    private String status;
    
    Student(){
     super();   
     status="online";
    }
    public void display(){
        super.display();
        System.out.println("\nStatus: "+status);
    }
}
