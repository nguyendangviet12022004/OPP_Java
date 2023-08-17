package b3;
import java.util.ArrayList;
public class Admission {
    ArrayList<Student> school;
    public Admission()
    {
        this.school = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        this.school.add(student);
    }
    public Student searchByID(int id)
    {
        for(int i = 0 ;i < this.school.size();i ++)
        {
            if(school.get(i).ID == id)
            {
                return school.get(i);
            }
        }
        return null;
    }
}
