package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstRow = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            int firstElement = firstRow[0];

            //алгоритъм за изместване на клетките в масива с едно назад
            for (int j = 0; j < firstRow.length - 1; j++) {
                firstRow[j] = firstRow[j + 1];
            }
            firstRow[firstRow.length - 1] = firstElement;
        }

        for (int num : firstRow) {
            System.out.print(num + " ");
        }
    }
}