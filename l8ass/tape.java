package l8ass;
public class tape extends publication{
    private int playingTime;

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }
    
        void display(){
        super.display();
        System.out.println("Playing Time: "+getPlayingTime()+" minutes");
    }
}
