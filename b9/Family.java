package b9;
public class Family{
    private String name_owner;
    private String home_id;
    private String meter_id;
    protected Family(String name_onwer, String home_id, String metter_id)
    {
        this.name_owner = name_onwer;
        this.home_id = home_id;
        this.meter_id = metter_id;
    }
    protected String show()
    {
        return this.name_owner + "   " + this.home_id + "   " + this.meter_id +"\n";
    }
}