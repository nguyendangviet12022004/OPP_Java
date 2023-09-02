package b11;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Calc calc = new Calc(c1, c2, '*');
        System.out.print(calc.result().toString());
    }
}
