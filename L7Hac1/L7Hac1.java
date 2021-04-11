package l7hac1;
public class L7Hac1 {
    public static void main(String[] args) {
        Address a1 = new Address();
        a1.setCity("Rawalpindi");
        a1.setCode(92);
        a1.setHouse(624);
        a1.setStreet(24);
        
        Person p1= new Person("Haris", a1);
        p1.display();
        

    }
    
}
