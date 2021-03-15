package l3ass1;
public class L3as1 {
    public int physics;
    public int maths;
    public int computerscience;
    
public L3as1(){
    physics=80;
    maths=74;
    computerscience=75;
}

public L3as1(int physics, int maths, int computerscience){
    this.physics=physics;
    this.maths=maths;
    this.computerscience=computerscience;
}
public int CalculateSum(){
    int sum=physics+maths+computerscience;
    return sum;
}
}
