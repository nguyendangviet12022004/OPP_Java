package b12;
public class Truck extends Vehicle{
    public int tonnage;
    public Truck(String ID, String brand, String year,int tonnage)
    {
        super(ID, brand, year, year);
        this.tonnage = tonnage;
    }
}