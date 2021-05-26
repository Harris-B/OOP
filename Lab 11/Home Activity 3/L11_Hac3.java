package l11_hac3;
interface Interface1 {
    public static final double iR = 1.5;
    public void show();
}
interface Interface2 {
    public static final double iR = 2.25;
    public void show();
}
class ConflictingInterfaceTest implements Interface1,Interface2{
    public void show(){
        System.out.println("Interest rate for this year : "+Interface1.iR);
        System.out.println("Interest rate for next year : "+Interface2.iR);

    }
}
public class L11_Hac3 {
    public static void main(String[] args) {
        ConflictingInterfaceTest iR = new ConflictingInterfaceTest();
        iR.show();
    }
    
}

