package b5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while(true)
        {
            System.out.println("1: Add\n2:Del\n3:Show\n4:Exit\n");
            int command = sc.nextInt() ;
            if(command == 1)
            {
                System.out.print("Choose Your Type Room: ");
                Room room = new Room(sc.next().charAt(0));
                Person person = new Person(sc.next(), sc.nextInt(), sc.next(), room);
                hotel.addPerson(person);
            }
            else if(command == 2)
            {
                System.out.print("ID: ");
                String ID = sc.next();
                hotel.delPerson(ID);
            }
            else if(command == 3)
            {
                hotel.show();
            }
            else {
                sc.close();
                break;
            }
        }
    }
}
