package SchoolManager;

import java.util.Hashtable;

public class School {
    protected Hashtable<String,Grade> grades;
    protected Hashtable<String,Teacher> teachers;
    public School()
    {
        this.grades = new Hashtable<String,Grade>();
        this.teachers = new Hashtable<String,Teacher>();
    }
}
