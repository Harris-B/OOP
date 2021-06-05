package l12_assign;

import java.util.Scanner;

class teacher extends Person implements association{
    //attributes
    private String designation;
    private String department;
    //constructor
    teacher(String name, String id){
        super(name,id);
        associate();
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    //associate
    @Override
    public void associate(){
        System.out.println("**Teacher**");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Designation: ");
        this.setDesignation(scanner.next());
        System.out.println("Enter Department: ");
        this.setDepartment(scanner.next());
    }
    //toString method
    @Override
    public String toString(){
        return super.toString()+"\nDesignation: "+designation+"\nDepartment: "+department;
    }
}
