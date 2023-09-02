package b8;

public class Student{
    protected String ID;
    protected String name;

    public Student(String ID, String name)
    {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.ID + "   " + this.name +"   " +"\n";
    }
}