package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstNumLine = Arrays
                .stream(scanner.nextLine(). split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
        int [] secondNumLine = Arrays
                .stream(scanner.nextLine(). split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < firstNumLine.length; i++) {
            if (firstNumLine[i] == secondNumLine[i]){
                sum += firstNumLine[i];
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.\n", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}