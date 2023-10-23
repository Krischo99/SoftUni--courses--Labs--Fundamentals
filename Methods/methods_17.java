package Fundamentals.Methods;

import java.util.Scanner;

public class methods_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            printDigit(n);
            System.out.println();
        }
    }

    public static void printDigit (int n1){

        for (int i = 0; i < n1; i++) {
            System.out.printf("%d ", n1);
        }
    }
}