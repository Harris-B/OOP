package lab11_ac1;

//interface
interface RegisterForExams {
    public void register();
}
    //class
class InterfaceTestClass {
    public InterfaceTestClass(RegisterForExams as){
        as.register();
    }
}
// class
class EmplayeeTask implements RegisterForExams{
    //attributes
    private String name;
    private String date;
    private int salary;
    
    //constructor
public EmplayeeTask(){
    name = null;
    date = null;
    salary = 0;
}
public EmplayeeTask(String name,String date,int salary){
    this.name = name;
    this.date = date;
    this.salary = salary;
}
@Override
public void register() {
    System.out.println("Name " + name + "\nsalary " + salary + "\n Employeereistered on date " + date);
}
}
//class
class StudentTask implements RegisterForExams{
    //attributes
    private String name;
    private int age;
    private double gpa;
    //const
public StudentTask(){
    name = null;
    age = 0;
    gpa = 0;
}
public StudentTask(String name,int age,double gpa){
    this.name = name;
    this.age = age;
    this.gpa = gpa;
}
 @Override
 public void register() {
    System.out.println("Student name " + name + " gpa " + gpa);
}
}

public class Lab11_Ac1 {    
    public static void main(String[] args) {
        EmplayeeTask e1 = new EmplayeeTask("Haris","26th May 2021",100_000);
        e1.register();
        
        StudentTask s1 = new StudentTask("ali",99,3.2);
        s1.register();
    }
    
}
