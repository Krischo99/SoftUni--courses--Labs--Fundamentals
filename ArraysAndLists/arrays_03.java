package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        int evenNumSum = 0;
        int oddNumSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0){
                evenNumSum += num;
            }else {
                oddNumSum += num;
            }
        }
        System.out.println(evenNumSum - oddNumSum);
    }
}