package l3ass1;
public class Marks {
    public int physics;
    public int maths;
    public int computerscience;
// constructor to store marks    
public Marks(){
    physics=80;
    maths=74;
    computerscience=75;
}
// argumented constructor
public Marks(int physics, int maths, int computerscience){
    this.physics=physics;
    this.maths=maths;
    this.computerscience=computerscience;
}
//method
public int CalculateSum(){
    int sum=physics+maths+computerscience;
    return sum;
}
}
