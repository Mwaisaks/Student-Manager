import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<Student>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();
        while (true) {
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

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> editRecord();
                case 5 -> deleterecord();
                case 6 -> {
                    System.out.print("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid coice! Please try again.");
            }
        }
    }

    static void addStudent(){
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter student's grade: ");
        String grade = scanner.nextLine();

        students.add(new Student(name, age, grade));
        System.out.println("Student added successfully!");
    }

    static void viewStudents(){
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\nList of Students:");
        for (Student student : students){
            System.out.println(student);
        }
    }

    static void searchStudent(){
        System.out.print("Enter the name of the student to search: ");
        String searchName = scanner.nextLine();
        for (Student student : students){
            if (student.name.equalsIgnoreCase(searchName)){
                System.out.println("Student Found: " + student);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    static void editRecord(){
        System.out.print("Enter the name of the student to edit: ");
        String editName = scanner.nextLine();

        for (Student student : students){
            if (student.name.equalsIgnoreCase(editName)) {
                System.out.println("Current record: " + student);
                System.out.println("1. Name\n2. Age\n3. Grade");
                System.out.print("Select the field to edit: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch ()
            }
        }
    }
}
