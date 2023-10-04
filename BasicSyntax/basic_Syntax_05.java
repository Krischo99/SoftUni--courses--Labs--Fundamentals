package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        boolean black = false;

        int longUsername = username.length();
        int fails = 0;

        for (int i = longUsername - 1; i >= 0; i--) {
            char letterOfUsername = username.charAt(i);
            password += letterOfUsername;
        }

        String input = scanner.nextLine();
        while (!input.equals(password)) {
            fails++;
            if (fails > 3) {
                black = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (black) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
