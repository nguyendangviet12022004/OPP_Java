package b2;

public class Book extends Doc {
    protected String author;
    protected int pageNums;
    public Book(int ID, String publiser, int releaseNums,String author,int pageNums )
    {
        super(ID, publiser, releaseNums);
        this.author = author;
        this.pageNums = pageNums;
        this.kind = "book";
    }
    @Override
    public String toString()
    {
        return this.kind + 
        "\n"  +this.ID + 
        "\n" + this.publiser + 
        "\n" + this.releaseNums+
        "\n" + this.author +
        "\n" + this.pageNums+
        "----------"; 
    }
}

