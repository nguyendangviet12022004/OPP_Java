package Company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Command: ");
            int command = sc.nextInt();
            if(command == 1)
            {
                //Add
                System.out.print("Type: ");
                int type = sc.nextInt();
                sc.nextLine();
                String ID, name, birth, sex;
                int salary;
                System.out.print("ID: ");
                ID = sc.nextLine();
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("birth: ");
                birth = sc.nextLine();
                System.out.print("Sex: ");
                sex = sc.nextLine();
                System.out.print("salary: ");
                salary = sc.nextInt();
                if(type == 1)
                {
                    System.out.print("Level: ");
                    int level = sc.nextInt();
                    manager.recruit(new Worker(ID, name, birth, sex, salary, level));
                }
                else if(type == 2)
                {
                    sc.nextLine();
                    System.out.print("Work: ");
                    String work = sc.nextLine();
                    manager.recruit(new Staff(ID, name, birth, sex, salary, work));
                }
                else {
                    sc.nextLine();
                    System.out.print("Specialise: ");
                    String specialise = sc.nextLine();
                    manager.recruit(new Engineer(ID, name, birth, sex, salary, specialise));
                }
            }
            else if(command == 2)
            {
                //layoff
                sc.nextLine();
                System.out.print("ID: ");
                String ID = sc.nextLine();
                manager.layOff(ID);
            }
            else if(command == 3)
            {
                manager.show();
            }
            else{
                //exit
                break;
            }
        }
        sc.close();
    }
}
