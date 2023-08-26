package b7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while(true)
        {
            System.out.print("Command: ");
            int command = sc.nextInt();
            sc.nextLine();
            if(command == 1)
            {
                System.out.print("ID: ");
                String ID = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                
                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Origin: ");
                String origin = sc.nextLine();
                System.out.print("Salary: ");
                int salary = sc.nextInt();
                System.out.print("Bonus: ");
                int bonus = sc.nextInt();
                System.out.print("Deduction: ");
                int deduction = sc.nextInt();
                Teacher t1 = new Teacher(ID, name, age, origin, salary, bonus, deduction);
                manager.addTeacher(t1);
            }
            else if (command == 2){
                System.out.print("ID: ");
                String ID = sc.nextLine();
                manager.delTeacher(ID);
            }
            else if(command == 3)
            {
                manager.showList();
            }
            else if(command == 4)
            {
                System.out.print("ID: ");
                String ID = sc.nextLine();
                System.out.print(manager.school.get(ID).finalSalary());
            }
            else {
                break;
            }
        }
        sc.close();
    }
}
