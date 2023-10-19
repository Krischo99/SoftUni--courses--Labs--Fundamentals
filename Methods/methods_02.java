package Fundamentals.Methods;

import java.util.Scanner;

public class methods_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        printGradeInWords(grade);
    }

    public static void printGradeInWords (double grades){

        if (grades >= 2.00 && grades <= 2.99){
            System.out.println("Fail");
        }else if (grades <= 3.49){
            System.out.println("Poor");
        }else if (grades <= 4.49){
            System.out.println("Good");
        }else if (grades <= 5.49){
            System.out.println("Very good");
        }else if (grades <= 6){
            System.out.println("Excellent");
        }
    }
}