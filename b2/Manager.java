package b2;
import java.util.ArrayList;
public class Manager {
    protected ArrayList<Doc> lib;
    public Manager()
    {
        this.lib = new ArrayList<>();
    }
    public void addDoc(Doc doc)
    {
        this.lib.add(doc);
    }
    public Doc searchByID(int id)
    {
        int l = this.lib.size();
        for(int i = 0 ;i < l ;i ++)
        {
            if(lib.get(i).ID == id) {
                return lib.get(i);
            }
        }
        return null;
    }
    public void deleteByID(int id)
    {
        int l = this.lib.size();
        for(int i = 0 ;i < l ;i ++)
        {
            if(lib.get(i).ID == id) {
                lib.remove(i);
                return;
            }
        }
    }
    public void searchByKind(String kind)
    {
        int l = this.lib.size();
        for(int i = 0 ;i < l ;i ++)
        {
            if(lib.get(i).kind.equals(kind)) {
                System.out.println(lib.get(i).toString());
            }
        }      
    }
}
