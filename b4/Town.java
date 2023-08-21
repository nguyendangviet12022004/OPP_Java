package b4;

import java.util.ArrayList;

public class Town {
    private ArrayList<Family> families ;
    public Town()
    {
        this.families = new ArrayList<>();
    }
    public void addFamily(Family family)
    {
        this.families.add(family);
    }
    public void showFamily()
    {    
        for(int i = 0 ;i < this.families.size();i++)
        {
            System.out.println("-------------------"+ i + "-------------------");
            this.families.get(i).showMember();
        }
    }
}
    

