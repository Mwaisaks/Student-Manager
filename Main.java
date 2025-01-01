import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<Student>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Welcome to the Student Management System ---");
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
        scanner.nextLine();

        System.out.print("Enter student's grade: ");
        String grade = scanner.nextLine();

        if (validateStudent(name, age, grade)){
            students.add(new Student(name, age, grade));
            System.out.println("Student added successfully!");
        }
        else {
            System.out.println("Invalid input. Student not added.");
        }
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
            if (student.getName().equalsIgnoreCase(searchName)){
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
            if (student.getName().equalsIgnoreCase(editName)) {
                System.out.print("Enter new name (leave blank to keep current): ");
                String newName = scanner.nextLine();
                if (!newName.isBlank()) student.setName(newName);

                System.out.print("Enter new age (leave blank to keep current): ");
                String newAge = scanner.nextLine();
                if (!newAge.isBlank()) student.setAge(Integer.parseInt(newAge));

                System.out.print("Enter new grade (leave blank to keep current): ");
                String newGrade = scanner.nextLine();
                if (!newGrade.isBlank()) student.setGrade(newGrade);

                System.out.println("Student record updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleterecord(){
        System.out.print("Enter the name of the student to delete: ");
        String deleteName = scanner.nextLine();

        for (Student student : students){
            if (student.getName().equalsIgnoreCase(deleteName)){
                students.remove(student);
                System.out.println("Student record deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static boolean validateStudent(String name, int age, String grade){
        return !name.isBlank() && age > 0 && !grade.isBlank();
    }
}
