package b8;

import java.util.Hashtable;
import java.util.Map;

public class Library {
    Hashtable<String,Book> library;
    public Library()
    {
        this.library = new Hashtable<String,Book>();
    }
    protected void addBook(Book book)
    {
        this.library.put(book.ID, book);
    }
    protected void show()
    {
        for(Map.Entry<String,Book> set: this.library.entrySet())
        {
            System.out.println(set.getValue().toString());
        }
    }
}
