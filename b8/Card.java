package b8;

public class Card {
    protected String ID;
    protected String ID_Student;
    protected String ID_Book;
    protected String Date;
    protected String Dateline;
    public Card(String ID, String ID_Student, String ID_Book, String Date, String Dateline)
    {
        this.ID = ID;
        this.ID_Student = ID_Student;
        this.ID_Book = ID_Book;
        this.Date = Date;
        this.Dateline = Dateline;
    }
    @Override
    public String toString()
    {
        return this.ID + "   " + this.ID_Student + "   " + this.ID_Book + "   " + this.Date + "   " + this.Dateline + "\n";
    }

}
