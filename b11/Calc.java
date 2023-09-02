package b11;

public class Calc {
    protected Complex c1;
    protected Complex c2;
    protected char op;
    public Calc(Complex c1, Complex c2, char op)
    {
        this.c1 = c1;
        this.c2 = c2;
        this.op = op;
    }
    public Complex result()
    {
        int a = this.c1.real;
        int b = this.c1.imaginary;
        int c = this.c2.real;
        int d = this.c2.imaginary;
        if(op == '+')
        {
            return new Complex(a + c, b + d);
        }
        else if(op == '-')
        {
            return new Complex(a-c, b - d);
        }
        else
        {
            return new Complex(a*c - b*d, a*d + b*c);
        }
    }
}
