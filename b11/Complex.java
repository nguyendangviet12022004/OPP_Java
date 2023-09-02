package b11;
public class Complex{
    protected int real;
    protected int imaginary;
    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    @Override
    public String toString()
    {
        return this.real + "+" + this.imaginary+"i\n";
    }
}