package l7ac1;
public class L7Ac1 {
    public static void main(String[] args) {
        studentRecord s = new studentRecord();
        s.setDegree("MBA");
        employeeRecord e = new employeeRecord();
        e.setEmp_id(47);
        e.setSalary(20);
        Manager m1 = new Manager("financeManager" , 5000, e, s ) ;
        m1.display();

    }
    
}
