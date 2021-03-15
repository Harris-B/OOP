package l4ass;
public class L4Ass {
    public static void main(String[] args) {
        HDstand s1 = new HDstand(1, 0);
		s1.justSold();
		s1.justSold();
		s1.justSold();
		
		s1.display();
		
		HDstand s2 = new HDstand(2, 4);
		s2.justSold();
		s2.justSold();
		
		s2.display();
		
		HDstand s3 = new HDstand(3, 1);
		s3.justSold();
		s3.justSold();
		s3.justSold();
		s3.justSold();
		
		s3.display();

    }
    
}
