package Fundamentals.ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> students = new ArrayList<>();

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] studentInfo = input.split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            int studentAge = Integer.parseInt(studentInfo[2]);
            String homeTown = studentInfo[3];

            Students student = new Students(firstName, lastName, studentAge, homeTown);

            boolean isEqual = false;

            if (!checkForEquals(students, student, isEqual)) {
                students.add(student);
            } else {
                studentInfoRepeat(students, student);
            }
        }

        String cityFilter = scanner.nextLine();

        for (Students currentStudent : students) {

            if (currentStudent.getHomeTown().equals(cityFilter)) {

                System.out.println(currentStudent.getStudentInfo());
            }
        }
    }

    public static boolean checkForEquals(List<Students> students, Students currentStudent, boolean isEqual) {

        for (int i = 0; i < students.size(); i++) {
            Students student = students.get(i);

            if (student.getFirstName().equals(currentStudent.getFirstName()) && student.getLastName().equals(currentStudent.getLastName())) {
                isEqual = true;
                break;
            }
        }

        return isEqual;
    }

    public static void studentInfoRepeat(List<Students> students, Students currentStudent) {

        for (int i = 0; i < students.size(); i++) {
            Students student = students.get(i);

            if (student.getFirstName().equals(currentStudent.getFirstName()) && student.getLastName().equals(currentStudent.getLastName())) {
                student.setAge(currentStudent.getAge());
                student.setHomeTown(currentStudent.getHomeTown());
                break;
            }
        }
    }
}
