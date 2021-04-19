package l8hac;
public class Faculty extends Employee{
    private int officeHours;
    private String rank;
    
    Faculty(){
        super();
        officeHours=8;
        rank="junior";
    }
        public void display(){
        super.display();
        System.out.println("\nOffice Hours: "+officeHours+"\nRank: "+rank);
    }
}
