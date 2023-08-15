package b1;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // 1: insert, 2 : search, 3 : show, 4 : exit
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer office = new ManagerOfficer();
        boolean ok = true;
        while(ok)
        {
            System.out.print("Command: ");
            int command = scanner.nextInt();
            switch(command)
            {
                case 1: 
                {
                    // a: E , b : S, c : W
                    String type = scanner.next();
                   
                    String name = scanner.next();
                    int age = scanner.nextInt();
                    String gender = scanner.next();
                    String address = scanner.next();
                    switch(type)
                    {
                        case "a":
                        {
                            String branch = scanner.next();
                            Engineer e = new Engineer(name, age, gender, address, branch);
                            office.addOfficer(e);
                            break;
                        }
                        case "b":
                        {
                            String task = scanner.next();
                            Staff s = new Staff(name, age, gender, address, task);
                            office.addOfficer(s);
                            break;
                        }
                        case "c":
                        {
                            int level = scanner.nextInt();
                            Worker w = new Worker(name, age, gender, address, level);
                            office.addOfficer(w);
                            break;
                        }
                        default:
                        {
                            System.out.println("Invalid");
                        }
                    }
                    break;
                    
                }
                case 2:
                {
                    String name = scanner.next();
                    ArrayList<Officer> ans = office.searchByName(name);
                    for(int i = 0 ;i < ans.size();i++) System.out.println(ans.get(i).toString());
                    break;
                }
                case 3 :
                {
                    office.showListOfficers();
                    break;
                }       
                case 4:
                {
                    scanner.close();
                    ok = false;
                    break;
                }
                default:
                {
                    System.out.println("Invalid");
                }

            }
        }
        
    }
}
