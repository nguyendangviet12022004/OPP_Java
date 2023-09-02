package SchoolManager;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("he180860", "Viet", "Nguyen");
        Student s2 = new Student("he1990", "Huong", "Pham");
        Student s3 = new Student("he1860", "Thao", "Nguyen");
        Teacher t1 = new Teacher("te1808", "Tram", "Tran", "NgocTramgmail.com");
        Grade g1 = new Grade("12A", t1);
        g1.addStudent(s1);
        g1.addStudent(s2);
        g1.addStudent(s3);
        g1.show();
    }
}
