package l7ass;
public class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;  // order with 3 pizzas p1 p2 and p3 
    
    public double calcTotal(){
        return p1.calcCost()+p2.calcCost()+p3.calcCost();
    }
    
}
