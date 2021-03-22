package l5ac1;
//Passing object as parameter to a method and change value of its data member. 
public class L5Ac1 {
    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        
        ObjectPass.increment(p);
        System.out.println("After calling: " + p.value);
    }
    
}
