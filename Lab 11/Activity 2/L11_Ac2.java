package l11_ac2;

interface Ordered {    
    public boolean follows(Object other);
    public boolean precedes(Object other);
}

class HourlyEmployee {
    
    protected int pay;
    
    public HourlyEmployee(int p){
         
        this.pay = p;
    }
    
    protected int getPay(){
       
        return pay;
    }
    
}
//class
class OrderedHourlyEmployee extends HourlyEmployee implements Ordered{

    public OrderedHourlyEmployee(int p) {
        super(p);
    }
    public boolean precedes(Object other) {
        if (other == null)
            return false;
        else if (!(other instanceof OrderedHourlyEmployee))
            return false;
        else{
            OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
            return (getPay() < otherOrderedHourlyEmployee.getPay());
 }
}
public boolean follows(Object other){
    if (other == null)
        return false;
    else if (!(other instanceof OrderedHourlyEmployee))
        return false;
    else {
        OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
        return (otherOrderedHourlyEmployee.precedes( this));
        } 
}
} 
public class L11_Ac2 {
       public static void main(String[] args) {
        
    }
    
}
