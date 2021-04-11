package l7ass;
public class L7Ass {
    public static void main(String[] args) {
        Pizza p1=new Pizza();
        p1.setSize(3);                      // setting size 1 for small 2 for medium and 3 for large
        p1.setCt(1);                        // setting 1 cheese toppping
        p1.setPt(1);                        // setting 3 pepparoni toppings
        p1.setHt(2);                        // setting 1 ham topping
        p1.getDescription();                //displays order description
        p1.calcCost();                      // displays cost of pizza including topping price
        
//        PizzaOrder po = new PizzaOrder();
//        System.out.println(po.calcTotal());
    }
    
}
