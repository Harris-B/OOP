package l9ass2;
public class L9Ass2 {
    public static void main(String[] args) {
        
        int count;
        StrTokenizer st = new StrTokenizer("abcd 122 bob");
        count = st.countTokens();
       
        System.out.println("Tokens:"+count);

    }
    
}
