package b12;


import java.util.ArrayList;

public class Manager {
    public ArrayList<Vehicle> vehicles;
    public Manager()
    {
        vehicles = new ArrayList<>();
    }
    public void add(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }
    public void del(String ID)
    {
        for(int i = 0;i < vehicles.size();i ++)
        {
            if(vehicles.get(i).ID.equals(ID)) 
            {
                vehicles.remove(i);
                break;
            }
        }
    }
    public void find(String brand, String color)
    {
        for(int i = 0 ;i < vehicles.size();i ++)
        {
            if(vehicles.get(i).brand.equals(brand) && vehicles.get(i).color.equals(color))
            {
                System.out.println(vehicles.get(i).toString());
            }
        }
    }
}
