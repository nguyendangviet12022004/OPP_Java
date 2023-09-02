package b10;

public class Text {
    protected String st;
    private String[] words ;
    public Text(String st)
    {
        this.st = st.trim();
        words = st.split(" ");
    }
    
    public void show()
    {
        for(String s : words)
        {
            System.out.println(s);
        }
    }
}
