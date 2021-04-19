package l8ass;
public class book extends publication{
    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
        void display(){
        super.display();
        System.out.println("Page Count:"+getPageCount());
        
    }
}
