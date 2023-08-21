package b4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Town t = new Town();
        int n = sc.nextInt();
        for(int i = 0 ;i < n;i ++)
        {
            int m = sc.nextInt();
            String address = sc.next();
            Family f = new Family(m, address);
            for(int j = 0 ;j < m;j ++)
            {
                String ID = sc.next();
                String name = sc.next();
                int age = sc.nextInt();
                String job = sc.next();
                Citizen c = new Citizen(name, age, job, ID);
                f.addMember(c);
            }
            t.addFamily(f);
        }
        sc.close();
        t.showFamily();

    }   
}
