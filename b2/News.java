package b2;

public class News extends Doc{
    protected int releaseDate;
    public News(int ID, String publiser, int releaseNums,int releaseDate)
    {
        super(ID, publiser, releaseNums);
        this.releaseDate = releaseDate;
        this.kind = "news";
    }
    @Override
    public String toString()
    {
        return this.kind + 
        "\n"  +this.ID + 
        "\n" + this.publiser + 
        "\n" + this.releaseNums+
        "\n" + this.releaseDate +
        "----------"; 
    }
}

