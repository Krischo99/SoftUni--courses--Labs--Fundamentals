package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.
                stream(scanner.nextLine().split(" ")).
                mapToInt(value -> Integer.parseInt(value)).
                toArray();
        int evenNumSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenNumSum += numbers[i];
            }
        }
        System.out.println(evenNumSum);
    }
}