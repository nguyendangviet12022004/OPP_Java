package SchoolManager;

import java.util.Hashtable;
import java.util.Map;

public class Grade {
    protected String gradeName;
    protected Teacher formTeacher;
    protected Hashtable<String,Student> students;
    public Grade(String gradeName,Teacher teacher)
    {
        this.gradeName = gradeName;
        this.formTeacher = teacher;
        students = new Hashtable<String,Student>(); 
    }
    public void addStudent(Student student)
    {
        this.students.put(student.ID, student);
    }
    protected void show()
    {
        System.out.println(this.gradeName);
        System.out.print(this.formTeacher.toString());
        for(Map.Entry<String,Student> set: this.students.entrySet())
        {
            System.out.print(set.getValue().toString());
        }
        System.out.println();
    }
}

