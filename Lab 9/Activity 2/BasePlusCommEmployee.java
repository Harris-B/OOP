package l9ac2;
public class BasePlusCommEmployee extends commissionEmployee {
    private double salary;
//default const
BasePlusCommEmployee(){
    salary=48000;
}
BasePlusCommEmployee(String A,String E,String B, double C, double D, double S){
    super(A,E,B,C,D); //takes values of AEBCD from parent class
    salary=S;
}
//overridden methods
@Override
public double earnings(){
    return super.earnings()+salary; //super gets the grosssale*commonrate
}
@Override
public void display(){
    super.display(); //displays the display method of parent class
    System.out.println("Salary : "+salary);
}
}
