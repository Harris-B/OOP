package l6ac2;
public class NoOfObjects {
    //data members
    private static int objs=0;
    private int a;
//const 
public NoOfObjects(){
    objs++;
}
public NoOfObjects(int x){
    a=x;
    objs++;
}
public static int getObjs (){
    return objs;
}

}
