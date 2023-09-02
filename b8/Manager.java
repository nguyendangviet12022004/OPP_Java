package b8;

import java.util.Hashtable;
import java.util.Map;

public class Manager {
    Hashtable<String,Card> cards;
    public Manager()
    {
        this.cards = new Hashtable<String,Card>(); 
    }
    public void addCard(Card card)
    {
        this.cards.put(card.ID, card);
    }
    public void delCard(String ID)
    {
        this.cards.remove(ID);
    }
    protected void show()
    {
        for(Map.Entry<String,Card> set: this.cards.entrySet())
        {
            System.out.println(set.getValue().toString());
        }
    }
}
