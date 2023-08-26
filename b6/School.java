package b6;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Student> students;
    
    protected School()
    {
        this.students = new ArrayList<>();
    }
    protected void addStudent()
    {
        String name, origin, group ;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Origin: ");
        origin = sc.nextLine();
        System.out.print("Group: ");
        group = sc.nextLine();
        Student student = new Student(name, age, origin, group);
        this.students.add(student);
        sc.close();
    }
    protected void filterStudentOldlerthan20()
    {
        for(int i = 0 ;i < this.students.size();i ++)
        {
            if(this.students.get(i).age > 20) System.out.println(this.students.get(i).toString());
        }
    }
    protected void filterstudent23YearsOldAndInDN()
    {
        for(int i = 0 ;i < this.students.size();i ++)
        {
            if(this.students.get(i).age == 23 && this.students.get(i).origin.equals("DN")) System.out.println(this.students.get(i).toString());
        }
    }
}
