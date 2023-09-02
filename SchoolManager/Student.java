package SchoolManager;

public class Student{
    protected String ID;
    protected String fName;
    protected String lName;
    public Student(String ID, String fName, String lName)
    {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
    }
    @Override
    public String toString()
    {
        return this.ID + "    " + this.fName + " " + this.lName + "\n";
    }
}