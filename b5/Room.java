package b5;

public class Room {
    protected char type;
    protected int price;
    public Room(char type)
    {
        this.type = type;
        if(type == 'A') this.price = 500;
        else if(type == 'B') this.price = 300;
        else this.price = 100;
    }
    @Override 
    public String toString()
    {
        return this.type + "    " + this.price + "\n";
    }
}
