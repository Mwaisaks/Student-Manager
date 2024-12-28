import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Management System.");
        System.out.println("1. Add a Student.");
        System.out.println("2. View all students.");
        System.out.println("3. Search for a student.");
        System.out.println("4. Edit a student record.");
        System.out.println("5. Delete a student record.");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
    }
}
