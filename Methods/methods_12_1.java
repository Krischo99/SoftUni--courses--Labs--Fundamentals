package Fundamentals.Methods;

import java.util.Scanner;

public class methods_12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);

        printCharacters(firstLetter,secondLetter);
    }

    public static void printCharacters(char n1, char n2){

        if (n1 < n2){

            for (int i = n1 + 1; i < n2; i++) {
                System.out.print((char) i+ " ");
            }
        }else {
            for (int i = n2 + 1; i < n1; i++) {
                System.out.print((char) i+ " ");
            }
        }
    }
}