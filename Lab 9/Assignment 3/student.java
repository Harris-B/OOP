package l9ass3;
//abstract class
abstract class student {
     String name;
     int age;
     int rollNumber;

    public student(){
        this.name = "Haris";
        this.age = 20;
        this.rollNumber = 060;
    }

    void display(){
        System.out.print("Name: "+name+"\nRoll Number: "+rollNumber+"\nAge: "+age);
    }
    
   //abstract method 
   abstract void takeExam();
}
