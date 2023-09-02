package SchoolManager;

public class Teacher {
    protected String ID;
    protected String fName;
    protected String lName;
    protected String email;
    public Teacher(String ID, String fName, String lName, String email)
    {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }
    @Override 
    public String toString()
    {
        return this.ID + "   " + this.fName + " " + this.lName + "   " + this.email + "\n";
    }
}
