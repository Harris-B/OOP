package l8ass;
public class publication {
     private String title;
     private int price;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    void display(){
        System.out.println("------------------------------------------");
        System.out.println("Title: "+getTitle()+"\nPrice: "+getPrice());
    }
    
}
