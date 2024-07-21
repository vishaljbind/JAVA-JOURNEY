public class LearnConstructors {
    public static void main(String[] args) {
       //Complex c0 = new Complex(); 
       Complex c1 = new Complex(3, 4);
       c1.println();

       Complex c2 = new Complex();
       c2.a = 7;
       c2.b = 8;
       c2.println();

       Complex c3 = new Complex(2);
       c3.println();

       System.out.println("adding numers");
       Complex c4 = c1.addComplex(c3);
       c4.println();
    }
}

class Complex {
    int a, b;
      
    // public Complex() {
    //  a = 6;
    //  b = 9;
    //  System.out.println("Creating a object!");
        
    // }

    public Complex(){

    }



    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex (int real){
        a = real;
        b = 5;
    }
    void println(){
    System.out.println(a+" + "+b+"i");
}

Complex addComplex(Complex num2){
    println();
    this.println();
    return new Complex(a+num2.a, b+num2.b);
}
}