package b12;

public class Moto extends Vehicle {
    public int wattage;
    public Moto(String ID, String brand, String year, int wattage)
    {
        super(ID, brand, year, year);
        this.wattage = wattage;
    }
}
