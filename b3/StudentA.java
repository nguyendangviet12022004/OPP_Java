package b3;

public class StudentA extends Student{
    protected double math;
    protected double physic;
    protected double chemistry;
    public StudentA(int ID, String name, String address, int prioritize, double math, double physic , double chemistry)
    {
        super(ID, name, address, prioritize);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.type = 'A';
    }
}
