package l3ass1;

public class L3Ass1 {
    public static void main(String[] args) {
        Marks m = new Marks();
        System.out.println("The sum is: "+m.CalculateSum());
        
        Marks n=new Marks(55,74,67);
        System.out.println("The sum is: "+n.CalculateSum());

    }
    
}
