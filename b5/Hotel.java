package b5;
import java.util.ArrayList;
public class Hotel {
    private ArrayList<Person> persons;
    public Hotel(){
        persons = new ArrayList<>();
    }
    public void addPerson(Person person)
    {
        this.persons.add(person);
    }
    public int searchID(String ID)
    {
        for(int i = 0 ;i < this.persons.size();i ++)
        {
            if(this.persons.get(i).ID.equals(ID)) return i;
        }
        return -1;
    }

    public void delPerson(String ID)
    {
        int index = searchID(ID);
        if(index == -1) return ;
        this.persons.remove(index);
    }

    public void show()
    {
        for(int i = 0 ;i < this.persons.size();i++)
        {
            System.out.println(this.persons.get(i).toString());
        }
    }
}
