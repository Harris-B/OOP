package l7hac2;
public class Book {
    private Person author;  // author of type person
    private String bookName;
    private String publisher;
    
//set get functions
    public void setBookName(String st){
        bookName=st;
    }
    public String getBookName(){
        return bookName;
    }
    public void setPublisher(String pb){
        publisher=pb;
    }
    public String getPublisher(){
        return publisher;
    }
    //display func
    public void display(){

        System.out.println("Author: "+author.getName()+"\nBook: "+bookName+"\nPublisher: "+publisher);
    }
}
