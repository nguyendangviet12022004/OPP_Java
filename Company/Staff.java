package Company;

public class Staff extends Employee{
    protected String work;
    public Staff(String ID, String name, String birth, String sex, int salary,String work)
    {
        super(ID, name, birth, sex, salary);
        this.work = work;
    }
    @Override
    public String toString()
    {
        return "Staff   " +  this.ID +"   "  + this.name + "   " +  this.work;
    }
}
