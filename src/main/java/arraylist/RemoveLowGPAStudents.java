package arraylist;

import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double gpa;

    // Constructor
    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
}

public class RemoveLowGPAStudents {

    public static void main(String[] args) {
        // Creating an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding students to the ArrayList
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 2.8));
        studentList.add(new Student("Mike", "Johnson", 3.9));
        studentList.add(new Student("Emily", "Williams", 2.5));

        // Displaying the original list of students
        System.out.println("Original list of students:");
        printStudentList(studentList);

        // Removing students with GPA less than the average GPA
        removeLowGPAStudents(studentList);

        // Displaying the remaining students
        System.out.println("\nRemaining students after removing low GPA students:");
        printStudentList(studentList);
    }

    // Method to remove students with GPA less than the average GPA
    private static void removeLowGPAStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to remove.");
            return;
        }

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.gpa;
        }
        double averageGPA = totalGPA / students.size();

        // Remove students with GPA less than the average GPA
        students.removeIf(student -> student.gpa < averageGPA);
    }

    // Method to print the list of students
    private static void printStudentList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }
    }
}
