package b7;
import java.util.Hashtable;
import java.util.Map;
public class Manager {
    Hashtable<String, Teacher> school ;
    protected  Manager()
    {
        this.school = new Hashtable<String,Teacher>();
    }
    protected void addTeacher(Teacher t)
    {
        this.school.put(t.ID, t);
    }
    protected void delTeacher(String ID)
    {
        this.school.remove(ID);
    }
    protected void showList()
    {
        for(Map.Entry<String,Teacher> set: this.school.entrySet())
        {
            System.out.println(set.getValue().toString());
        }
    }
}
