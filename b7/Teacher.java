package b7;
public class Teacher{
    protected String ID;
    private String name;
    private int age;
    private String origin;
    private int salary;
    private int bonus;
    private int deduction;
    protected Teacher(String ID, String name, int age, String origin, int salary , int  bonus , int deduction)
    {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }
    @Override
    public String toString()
    {
        return this.ID + "   " + this.name + "   " + this.age + "   " + this.origin +"\n";
    }

    protected int finalSalary()
    {
        return this.salary + this.bonus - this.deduction;
    }
}