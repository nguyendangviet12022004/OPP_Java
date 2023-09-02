package b9;

public class Bill {
    private Family family;
    private int old_electric_index;
    private int new_electric_index;
    protected Bill( Family family, int old_electric_index,int new_electric_index)
    {
        this.family = family;
        this.old_electric_index = old_electric_index;
        this.new_electric_index = new_electric_index;
    }
    protected String show()
    {
        return "Family: "+this.family.show() + "Old: " + this.old_electric_index  + "\nNew: " + this.new_electric_index + "\nBill: " + 5*(this.new_electric_index-this.old_electric_index) + "\n";
    }
}
