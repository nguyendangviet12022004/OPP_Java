package b2;
public class Magazine extends Doc{
    protected int issueID;
    protected int releaseMonth;
    public Magazine(int ID, String publiser, int releaseNums,int issueID,int releaseMonth)
    {
        super(issueID, publiser, releaseNums);
        this.issueID = issueID;
        this.releaseMonth = releaseMonth;
        this.kind = "magazine";
    }
    @Override
    public String toString()
    {
        return this.kind + 
        "\n"  +this.ID + 
        "\n" + this.publiser + 
        "\n" + this.releaseNums+
        "\n" + this.issueID +
        "\n" + this.releaseMonth+
        "----------"; 
    }
}