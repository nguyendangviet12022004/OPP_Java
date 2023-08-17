package b3;

public class StudentB extends Student {
    protected double math;
    protected double chemistry;
    protected double bio;
    public StudentB(int ID, String name, String address, int prioritize,double math, double chemistry, double bio)
    {
        super(ID, name, address, prioritize);
        this.math = math;
        this.chemistry = chemistry;
        this.bio = bio;
        this.type = 'B';
    }
}
