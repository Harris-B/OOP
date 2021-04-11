package l7hac1;
public class Address {
    private int street;
    private int house;
    private String city;
    private int code;
    
    //constructor
    public Address(){
    }
    //set get functions
    public void setStreet(int s){
        street=s;
    }
    public int getStreet(){
        return street;
    }
    public void setHouse(int h){
        house=h;
    }
    public int getHouse(){
        return house;
    }
    public void setCity(String c){
        city=c;
    }
    public String getCity(){
        return city;
    }
    public void setCode(int c){
        code=c;
    }
    public int getCode(){
        return code;
    }
    
}
