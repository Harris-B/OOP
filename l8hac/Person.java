package l8hac;
public class Person {
    protected String name;
    protected String address;
    protected int phoneNumber;
    protected String emailAddress;
    
    Person(){
    name="Haris";
    address="rawalpindi";
    phoneNumber=1122;
    emailAddress="haris@gmail.com";
    }
    public void display(){
        System.out.println("Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phoneNumber+"\nEmail: "+emailAddress);
    }
}
