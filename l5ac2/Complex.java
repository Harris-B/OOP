package l5ac2;
public class Complex {
    private double real;
    private double imag;
//constructor
public Complex(){ 
    real = 0.0; 
    imag = 0.0; 
}
//argumented constructor
public Complex (double r, double im){
    real = r; 
    imag = im; 
}
public Complex Add (Complex b){
        Complex c_new = new Complex 
        (real + b.real, imag+ b.imag);
        return c_new;
}
public void Show (){
System.out.println( real + imag);
}

}
