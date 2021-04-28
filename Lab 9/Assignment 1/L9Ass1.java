package l9ass1;
public class L9Ass1 {
    public static void main(String[] args) {
        
        clock c1 = new clock(2,14,00);
        c1.printTime();// displays time in 12 hr format
        
        clockChild c2 = new clockChild(21,12,05);
        c2.printTime(); //displays time in 24Hr format with AM/PM
        
        
    }
    
}
