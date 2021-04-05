package l6hac1;
public class SavingsAccount {
   static double annualInterestRate=3;
   private double  savingsBalance;
// setter and getter
   public void setSavingsBalance(double y){this.savingsBalance=y;}
   public double getSavingsBalance(){return savingsBalance;}
//method
public double calculateMonthlyInterest(){
    double x;
    x=(savingsBalance*annualInterestRate)/12;
    savingsBalance+=x;
    return x;
}
//static method
public static void  modifyInterestRate(){
    annualInterestRate=4;
}
public double calculateModifyIR(){
    double x;
    x=(savingsBalance*annualInterestRate)/12;
    savingsBalance+=x;
    return x;
}
public void Display(){
    System.out.println("Balance at 3% annual interest: "+this.calculateMonthlyInterest());
    System.out.println("Balance after 4% annual interest: "+calculateModifyIR());
}

}
