package l9ac1;
public class B extends A{
    int k;
//arg const    
B(int a, int b, int c) {
    super(a, b); // takes values of a,b from const of class A
    k = c;
}
// display k – this overrides show() method in A
void show() {
    //super.show(); // if used it will fisrt display the show method of class A
    System.out.println("k: " + k);
}
}
