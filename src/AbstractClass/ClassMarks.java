package AbstractClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassMarks {
// Create an inner class Student

    public static class Student {

        public double studentNumber;
        public double studentGrade;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students in class: ");
        int students = input.nextInt();
        int x = students;

        // Create a list to hold your students
        List<Student> studentsList = new ArrayList<>();

        while (x > 0) {
            Student myNewStudent = new Student();
            System.out.println("Enter student number: ");
            myNewStudent.studentNumber = input.nextDouble();
            System.out.println("Enter student grade: ");
            myNewStudent.studentGrade = input.nextDouble();

            // update fields 
            studentsList.add(myNewStudent);

            x = x - 1;
        }

        // Loop your student List
        for (Student s : studentsList) {
            // Get student info
            System.out.println("Student number is: "+s.studentNumber+" grade is : "+s.studentGrade);
        }
    }
}