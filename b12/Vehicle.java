package b12;
public class Vehicle{
    public String ID;
    public String brand;
    public String year;
    public String color;
    public Vehicle(String ID, String brand, String year, String color)
    {
        this.ID = ID;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString()
    {
        return this.ID + " " + this.brand + " " + this.year + " " + this.color ;
    }
}