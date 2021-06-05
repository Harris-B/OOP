package l12_assign;
import java.util.ArrayList;
public class HumanResource {
//lab part
    
/*public class HumanResource
{
    private Association[] associations;
    
    public void add(Association resource){
        if (associations == null)
            associations = new Association[1];
        else
            extend();
        associations[associations.length-1] = resource;
    }
    
    private void extend(){
        Association[] t = new Association[associations.length + 1];
        for (int i = 0; i < associations.length; i++){
            t[i] = associations[i];
        }
        associations = t;
    }
    public void delete(int i)
    {
        associations[i-1] = null;
        Association[] t = new Association[associations.length - 1];
        int i = 0;
        while (associations[i] != null) {
            t[i] = associations[i];
            i++;
        }
        for (int j = i; j < t.length; j++)
        {
            t[j] = associations[j+1];
        }
        associations = t;
    }
    
    public String toString(){
        String x = "";
        for (int i = 0; i < associations.length; i++)
        {
            x += associations[i].toString();
            x += "\n";
        }
        return x;
    }
}*/
    
//using array lists
    private ArrayList<association> resources = new ArrayList<association>(); 
    
    public void add( association resource){
        resources.add(resource);
    }

    public boolean delete(association resource){
       return resources.remove(resource);
    }
    
    public String toString(){
        return ""+resources;
    }
   
}


