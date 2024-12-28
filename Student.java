import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(){
        System.out.print("Enter the Student name: ");
        name = scanner.nextLine();

        System.out.print("Enter the age of Student: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the grade of Student: ");
        grade = scanner.nextLine();

        students.add();

    }

    public void viewStudents(){
        System.out.println("List of Students: ");
        for (Student student : students){
            System.out.println(student);
        }
    }

    public void searchStudent(){
        System.out.print("Enter the name of the Student to search: ");
        String searchName = scanner.nextLine();

        if (students.contains(searchName) ){
            System.out.println("Student found: ");
            System.out.println(students.get(searchName));
        }
        else {
            System.out.println("Student not found!");
        }
    }
}

