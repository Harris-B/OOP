package l9ass2;
import java.util.StringTokenizer;
public class StrTokenizer extends StringTokenizer{ //extending from predefined method
    String s;
    //constructor
    public StrTokenizer(String x) {
        super(x);
        this.s=x;
    }
   
    @Override
   public int countTokens(){
       int z = super.countTokens();
       int count = z;
        String token;
        for(int i = 0; i<z; i++){
            token = super.nextToken();
            for(int j = 0; j<token.length(); j++){
                if(Character.isDigit(token.charAt(j))){
                    count--; //excluding numeric tokens
                    break;
                }
            }
        }
    
        return count;
    
    }
}
