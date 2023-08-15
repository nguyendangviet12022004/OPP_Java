package b1;
import java.util.ArrayList;
public class ManagerOfficer {
    private ArrayList<Officer> officers;
    public ManagerOfficer()
    {
        this.officers = new ArrayList<>();
    }
    public void addOfficer(Officer officer)
    {
        this.officers.add(officer);
    }
    public ArrayList<Officer> searchByName(String name)
    {
        ArrayList<Officer> ans = new ArrayList<>();
        for(int i = 0 ;i < officers.size();i++)
        {
            if(officers.get(i).name.equals(name)) 
            {
                ans.add(officers.get(i));
            }
        }
        return ans;
    }
    public void showListOfficers()
    {
        for(int i = 0;i < officers.size();i++)
        {
            System.out.println(officers.get(i).toString());
        }
    }

}

