package b12;
public class Car extends Vehicle{
    public int CountOfSeats;
    public String engine;
    public Car(String ID, String brand, String year, String color, int CountOfSeats, String engine)
    {
        super(ID, brand, year, color);
        this.CountOfSeats = CountOfSeats;
        this.engine = engine;
    }
}
