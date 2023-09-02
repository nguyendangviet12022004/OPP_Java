package b8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school= new School();
        Library library = new Library();
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        //Student List;
        school.addStudent(new Student("he180860", "Nguyen Dang Viet"));
        school.addStudent(new Student("hs180860", "Pham Thi Quynh Huong"));
        school.addStudent(new Student("hk180808", "Pham Thi Khanh Ly"));
        // Book List;
        library.addBook(new Book("hk1", "Dac Nhan Tam", "null"));
        library.addBook(new Book("hs01", "Hat Giong Tam Than", "FAcebook"));
        library.addBook(new Book("hm08", "Cha Giau Cha Ngheo", "Viet Nguyen"));
       
        //Main Function
        while(true)
        {
            System.out.println("1: Add Card, 2: Del Card, 3: Show Card, 4: Show Detail Card By ID, 5:Escape\n");
            int command = sc.nextInt();
            sc.nextLine();
            if(command == 1)
            {
                System.out.print("ID: ");
                String ID = sc.nextLine();
                System.out.print("Student ID: ");
                String ID_Student = sc.nextLine();
                System.out.print("Book ID: ");
                String ID_Book = sc.nextLine();
                System.out.print("Date: ");
                String Date = sc.nextLine();
                System.out.print("Dateline: ");
                String Dateline = sc.nextLine();
                manager.addCard(new Card(ID, ID_Student, ID_Book, Date, Dateline));
            }
            else if(command == 2)
            {
                System.out.print("ID: ");
                String ID = sc.nextLine();
                manager.delCard(ID);
            }
            else if(command == 3)
            {
                manager.show();
            }
            else if(command == 4)
            {
                System.out.print("ID: ");
                String ID = sc.nextLine();
                Card card = manager.cards.get(ID);
                System.out.print(school.school.get(card.ID_Student).toString());
                System.out.print(library.library.get(card.ID_Book).toString());
                System.out.println(card.Date + "---->" + card.Dateline);
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
