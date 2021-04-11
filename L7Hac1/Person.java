package l7hac1;
public class Person {
    private String name;
    private Address address;
    
    //constructor 
    public Person(String name, Address ad){
        this.name=name;
        this.address=ad;
    }
    // display func
    public void display(){
        System.out.println("House No. "+address.getHouse()+"\nStreet No. "+address.getStreet()+"\nCity: "+address.getCity()+"\nCode: "+address.getCode());
    }
}
