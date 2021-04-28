package l9ass3;
//concrete class
class gradStudent extends student{
  //constructor
    gradStudent(){
        super();
    }
    @Override  // overriding the abstract method in student class
     void takeExam(){
         super.display();
         System.out.println("\ngraduate student gives written exam");
     }
}
