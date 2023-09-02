package b8;

import java.util.Hashtable;
import java.util.Map;


public class School {
    protected Hashtable<String,Student> school;
    public School()
    {
        this.school = new Hashtable<String,Student>();
    }
    protected void addStudent(Student student)
    {
        this.school.put(student.ID,student);
    }
    protected void show()
    {
        for(Map.Entry<String,Student> set: this.school.entrySet())
        {
            System.out.println(set.getValue().toString());
        }
    }
}
