package b9;

public class Main {
    public static void main(String[] args) {
        Family family = new Family("Nguyen Dang Viet", "he180880", "me180860");
        Bill bill = new Bill(family, 0, 100);
        System.out.println(bill.show());
    }
}
