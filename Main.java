import java.util.Scanner;
class Person {
    String name;
    int age;
    void getPersonDetails(Scanner sc) {
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }
}
class Student extends Person {
    int rollNo;
    int m1, m2, m3;
    void getStudentDetails(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();
    }
    double calAvg() {
        return (m1 + m2 + m3) / 3.0;
    }
    double calPer() {
        return ((m1 + m2 + m3) / 300.0) * 100;
    }
    void display() {
        System.out.println("\nName       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Average    : " + calAvg());
        System.out.println("Percentage : " + calPer() + "%");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Details for Student " + (i + 1));
            s[i] = new Student();
            s[i].getPersonDetails(sc);
            s[i].getStudentDetails(sc);
        }
        System.out.println("\n===== STUDENT DETAILS =====");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1));
            s[i].display();
        }
        sc.close();
    }
}