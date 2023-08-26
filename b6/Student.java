package b6;

public class Student{
    protected String name;
    protected int age;
    protected String origin;
    protected String group;
    protected Student(String name, int age , String origin,String group)
    {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.group = group;
    }
    @Override
    public String toString()
    {
        return this.name + " " + this.group + " " + this.age + " " + this.origin + "\n";
    }
}