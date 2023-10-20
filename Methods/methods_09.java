package Fundamentals.Methods;

import java.util.Scanner;

public class methods_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeValues = scanner.nextLine();

        if (typeValues.equals("string")) {
            System.out.println(getMaxString(scanner));
        } else if (typeValues.equals("char")) {
            System.out.println(getMaxChar(scanner));
        } else if (typeValues.equals("int")) {
            System.out.println(getMaxInt(scanner));
        }
    }

    public static String getMaxString(Scanner scanner) {
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.compareTo(second) >= 0) {
            return first;
        }

        return second;
    }

    public static char getMaxChar(Scanner scanner) {
        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);

        if (firstLetter > secondLetter) {
            return firstLetter;
        }

        return secondLetter;
    }

    public static int getMaxInt(Scanner scanner) {
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            return num1;
        }

        return num2;
    }
}