package Fundamentals.MoreSoftUniLabs.Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take how many rows we want
        int rows = Integer.parseInt(scanner.nextLine());
        // Start up array
        int[] numb = {1, 1};

        for (int i = 0; i < numb.length; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(numb[i] + " ");
            }
            System.out.println();

            rows--;
            if (rows == 0) {
                break;
            }
        }

        for (int i = 1; i <= rows; i++) {

            int[] arr = new int[numb.length - 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = numb[j] + numb[j + 1];
            }

            numb = new int[arr.length + 2];
            numb[0] = 1;
            for (int j = 0; j < arr.length; j++) {
                numb[j + 1] = arr[j];
            }
            numb[numb.length - 1] = 1;

            for (int j = 0; j < numb.length; j++) {
                System.out.print(numb[j] + " ");
            }
            System.out.println();
        }
    }
}