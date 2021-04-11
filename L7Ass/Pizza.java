package l7ass;
public class Pizza {
    private int size;
    private int nct; // nct = number of cheese toppings
    private int npt; // npt = number of pepparoni topping
    private int nht; // nht = number of ham topping

    //constructor
    public Pizza(){
    }
    // set get functions
    public void setSize(int s){
        size=s;
    }
    public int getSize(){
        return size;
    }
    public void setCt(int ct){
        nct=ct;
    }
    public int getCt(){
        return nct;
    }
    public void setPt(int pt){
        npt=pt;
    }
    public int getPt(){
        return npt;
    }
    public void setHt(int ht){
        nht=ht;
    }
    public int getHt(){
        return nht;
    }
    // method
    public void getDescription(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("pizza sizes are as follows: \n1 -> small\n2 -> medium\n3 -> large");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Pizza Size: "+size+"\nNumber of cheese toppings: "+nct+"\nNumber of Pepparoni toppings: "+npt+"\nNumber of Ham toppings: "+nht);
    }
    //method to calculate cost
    public double calcCost(){
    System.out.println("------------------------------------------------------------------");
        System.out.println("Total cost is as follows: ");
        int cost=0;
              if(size==1)
                cost=10+2*(nct+npt+nht);
              else if(size==2)
                 cost=12+2*(nct+npt+nht);
              else if(size==3)
                cost=14+2*(nct+npt+nht);
        System.out.print("$");
        System.out.println(cost);
        System.out.println("------------------------------------------------------------------");
        return cost;
    }
    
}
