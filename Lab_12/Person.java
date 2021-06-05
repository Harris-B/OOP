package l12_assign;
class Person {
    //attributes
    protected String name;
    protected String id;
    //constructor
    public Person(String name, String id){
        this.name=name;
        this.id=id;
    }
    //getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    //toString method
    public String toString(){
        return "Name: "+name+"\nID: "+id;
    }

}
