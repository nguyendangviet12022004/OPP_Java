package Company;

public class Employee{

    protected String ID;
    protected String name;
    protected String birth;
    protected String sex;
    protected int salary;
    public Employee(String ID, String name, String birth, String sex, int salary)
    {
        this.ID = ID;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.salary = salary;
    }
    
}