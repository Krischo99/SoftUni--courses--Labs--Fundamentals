package Fundamentals.Methods;

import java.util.Scanner;

public class methods_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);

        printCharacters(smallestChar(firstLetter,secondLetter), biggerChar(firstLetter,secondLetter));
    }

    public static void printCharacters (char n1, char n2){

        for (int i = n1 + 1; i < n2 ; i++) {
            char currentLetter = (char) i;
            System.out.printf("%c ", currentLetter);
        }
    }

    public static char biggerChar (char n1, char n2){

        if (n1 > n2){
            return n1;
        }

        return n2;
    }

    public static char smallestChar (char n1 , char n2){

        if (n1 < n2){
            return n1;
        }

        return n2;
    }
}