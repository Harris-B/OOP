package l9ass3;
//concrete class
class phdStudent extends student{
    //constructor
    phdStudent(){
        super();
    }
    
    @Override  // overriding the abstract method in student class
    void takeExam(){
        super.display();
        System.out.println("\nphd student gives exam via presentation");
    }
}
