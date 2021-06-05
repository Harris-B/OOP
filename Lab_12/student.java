package l12_assign;

import java.util.Scanner;

class student extends Person implements association{
    //attributes
    private int rollNo;
    private int semester;
    //constructor
    student(String name, String id){
        super(name,id);
        associate();
    }
//getter and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    //associate
    @Override
    public void associate(){
        System.out.println("**Student**");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll Number: ");
        this.setRollNo(scanner.nextInt());
        System.out.println("Enter Semester: ");
        this.setSemester(scanner.nextInt());
    }
    
    //toString method
    @Override
    public String toString(){
        return super.toString()+"\nRoll No: "+rollNo+"\nSemester: "+semester;
    }
}
