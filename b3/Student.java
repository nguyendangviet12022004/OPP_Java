package b3;
public class Student{
    protected int ID;
    protected String name;
    protected String address;
    protected int prioritize;
    protected char type;
    public Student(int ID, String name, String address, int prioritize)
    {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.prioritize = prioritize;
        this.type = 'S';
    }
    @Override
    public String toString()
    {
        return this.ID +"\n" + this.name +"\n" + this.address +"\n" + this.prioritize +"\n" + this.type +"\n-------------------------------------------\n"; 
    }
}