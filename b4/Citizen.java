package b4;

public class Citizen{
    protected String name;
    protected int age;
    protected String job;
    protected String ID;

    public Citizen(String name, int age ,String job ,String ID)
    {
        this.name = name;
        this.age = age;
        this.job = job;
        this.ID = ID;
    }
    @Override 
    public String toString()
    {
        return "ID: " + this.ID + "\nName: "+this.name + "\n\n";
    }
}