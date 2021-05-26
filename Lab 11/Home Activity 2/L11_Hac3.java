package l11_hac3;
interface A{
    void Add();
}
interface B{
    void Add();
}
class cal implements A,B{
    @Override       // there is only one @Override necessary
                    //This is because A.Add() and B.Add() are "@Override-equivalent"
    public void Add(){
            System.out.println("adding the numbers");
}

}
public class L11_Hac3 {
    public static void main(String[] args) {
        cal c1 = new cal();
        c1.Add();
    }
    
}
