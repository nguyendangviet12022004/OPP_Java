package Company;

public class Worker extends Employee{
    protected int level;
    public Worker(String ID, String name, String birth, String sex, int salary,int level)
    {
        super(ID, name, birth, sex, salary);
        this.level = level;
    }
    @Override
    public String toString()
    {
        return "Worker   " + this.ID + "   " + this.name ;
    }
}
