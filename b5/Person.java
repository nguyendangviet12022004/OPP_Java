package b5;
public class Person{
    protected String name;
    protected int age;
    protected String ID;
    protected Room room;
    public Person(String name, int age, String ID, Room room)
    {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.room = room;
    }
    @Override
    public String toString()
    {
        return this.ID + "   " + this.name + "   " + this.age + "   " + this.room.toString() + "\n";    
    }
}