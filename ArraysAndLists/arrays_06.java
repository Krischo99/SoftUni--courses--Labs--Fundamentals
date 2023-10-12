package Fundamentals.ArraysAndLists;

import java.util.Scanner;

public class arrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstRow = scanner.nextLine().split(" ");
        String[] secondRow = scanner.nextLine().split(" ");
        String equalsStrings = "";

        for (int i = 0; i < secondRow.length; i++) {
            for (int j = 0; j < firstRow.length; j++) {
                if (secondRow[i].equals(firstRow[j])){
                    equalsStrings += secondRow[i] + " ";
                }
            }
        }
        System.out.println(equalsStrings);
    }
}