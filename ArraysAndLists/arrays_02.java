package Fundamentals.ArraysAndLists;

import java.util.Scanner;

public class arrays_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] elements = scanner.nextLine().split(" ");
        String firstElement = "";

        for (int i = 0; i < elements.length /2; i++) {
            firstElement = elements [i];
            elements [i] = elements [elements.length-1 - i];
            elements [elements.length-1 - i] = firstElement;
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("%s ",elements[i]);
        }
    }
}
