package Company;

import java.util.Hashtable;
import java.util.Map;

public class Manager {
    Hashtable<String,Employee> employees;
    public Manager()
    {
        this.employees = new Hashtable<>();
    }
    public void recruit(Employee employee)
    {
        this.employees.put(employee.ID,employee);
    }
    public void layOff(String ID)
    {
        this.employees.remove(ID);
    }
    public void show()
    {
        for(Map.Entry<String,Employee> set: this.employees.entrySet())
        {
            System.out.println(set.getValue().toString());
        }
    }
}
