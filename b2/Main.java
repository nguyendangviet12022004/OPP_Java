package b2;

public class Main {
    public static void main(String[] args) {
        Manager mn = new Manager();

        //1
        Book b1 = new Book(1, "Ric", 1, "Viet", 100);
        Book b2 = new Book(2, "Hello", 12, "Viet", 100);
        // 2
        Magazine m1 = new Magazine(3, "DellBiet", 12, 12, 12);
        Magazine m2 = new Magazine(4, "Next", 0, 2, 2);
        //3
        News n1 = new News(5, "Kotex", 0,1);
        News n2 = new News(6, "Diana", 12, 12);

        mn.addDoc(b1);
        mn.addDoc(b2);
        mn.addDoc(m1);
        mn.addDoc(m2);
        mn.addDoc(n1);
        mn.addDoc(n2);
    }
}
