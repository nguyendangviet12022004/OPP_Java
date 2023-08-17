package b3;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static Admission admission = new Admission();
    public void TypeStudent()
    {
        System.out.println("Type ID,Name,Add,Prio,Type,Score Of 3 Subject");
        int ID = sc.nextInt();
        String name = sc.next();
        String address= sc.next();
        int prioritize = sc.nextInt();
        char type = sc.next().charAt(0);
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();
        System.out.println("Added The Student");
        if(type == 'A')
        {
            StudentA student = new StudentA(ID,name,address,prioritize,score1,score2,score3);
            admission.addStudent(student);
            System.out.println(student.toString());
        }
        else if(type == 'B')
        {
            StudentB student = new StudentB(ID,name,address,prioritize,score1,score2,score3);
            admission.addStudent(student);
            System.out.println(student.toString());

        }
        else
        {
            StudentC student = new StudentC(ID,name,address,prioritize,score1,score2,score3);
            admission.addStudent(student);
            System.out.println(student.toString());
        }
    }
    public static void main(String[] args) {
        
        Main obj = new Main();
        while(true)
        {
            System.out.println("Type The Command:");
            int command = sc.nextInt();
            if(command == 1)
            {
                obj.TypeStudent();
            }
            else if(command == 2)
            {
                int id = sc.nextInt();
                System.out.println(admission.searchByID(id).toString());
            }
            else{
                sc.close();
                break;
            }
        }
    }
}
