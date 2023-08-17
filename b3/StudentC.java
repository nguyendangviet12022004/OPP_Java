package b3;

public class StudentC extends Student{
    protected double literature;
    protected double history;
    protected double geography;
    public StudentC(int ID, String name, String address, int prioritize,double literature, double history, double geography)
    {
        super(ID, name, address, prioritize);
        this.literature = literature;
        this.history = history;
        this.geography = geography;
        this.type = 'C';
    }
}
