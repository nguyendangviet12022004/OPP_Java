package b8;

public class Book {
    protected String ID;
    protected String name;
    protected String author;
    public Book(String ID, String name, String author)
    {
        this.ID = ID;
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString()
    {
        return this.ID + "   " + this.name + "   " + this.author+"\n";
    }
}
