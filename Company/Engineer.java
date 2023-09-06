package Company;

public class Engineer extends Employee{
    protected String specialise;
    public Engineer(String ID, String name, String birth, String sex, int salary,String specialise)
    {
        super(ID, name, birth, sex, salary);
        this.specialise = specialise;
    }
    @Override
    public String toString()
    {
        return "Engineer   " + this.ID + "   " + this.name;
    }
}
