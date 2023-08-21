package b4;

import java.util.ArrayList;

public class Family {
    private ArrayList<Citizen> citizens;
    protected int memberCount;
    protected String address;
    public Family(int memberCount, String address)
    {
        this.citizens = new ArrayList<>();
        this.memberCount = memberCount;
        this.address = address;
    }
    public void showMember()
    {
        for(int i = 0 ;i < citizens.size();i++)
        {
            System.out.println("Member " + i + " ");
            System.out.print(citizens.get(i).toString());
        }
    }
    public void addMember(Citizen member)
    {
        this.citizens.add(member);
    }
}
