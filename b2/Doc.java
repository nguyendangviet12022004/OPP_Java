package b2;
public class Doc{
    protected int ID;
    protected String publiser;
    protected int releaseNums;
    protected String kind = "doc";
    public Doc(int ID, String publiser, int releaseNums)
    {
        this.ID = ID;
        this.publiser = publiser;
        this.releaseNums = releaseNums;
    }
}