package l2ac1;
public class CourseResult {
    public String studentName;
    public String courseName;
    public String grade;
    
    public void display(){
    System.out.println("\n \n");
    System.out.println(" Student Name is :" + studentName + " \n Course Name is: " + courseName +"\n Grade is: "  + grade);
}
}
public class L2Ac1 {

    public static void main(String[] args) {
CourseResult c1=new CourseResult ();
c1.studentName= "Ali";
c1.courseName= "OOP";
c1.grade="A";
c1.display();

CourseResult c2=new CourseResult ();
c2.studentName= "SABA";
c2.courseName= "ICP";
c2.grade= "A=";
c2.display();

    }
}

    

