package Fundamentals.ClassesAndObjects;

import java.util.*;

public class Main_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {

            String[] inputParts = scanner.nextLine().split(" ");
            double grade = Double.parseDouble(inputParts[2]);
            Student student = new Student(inputParts[0], inputParts[1], grade);
            students.add(student);
        }

        Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
        for (Student currentStudent : students) {
            System.out.println(currentStudent.printStudentInfo());
        }
    }
}
