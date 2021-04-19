package l8hac;
public class Staff extends Employee{
    private String title;
    
    Staff(){
        super();
        title="Staff member";
    }
    public void display(){
        super.display();
        System.out.println("\nTitle: "+title);
    }
}
