package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = 0;
        String longest = "";
        String theBestLongest = "";
        for (int i = 0; i < numbers.length - 1; i++) {

            if (count <= 0 && (numbers[i] == numbers[i + 1])){
                longest = numbers[i] + " " + numbers[i+1];
                count++;
            }else if (count > 0 && (numbers[i] == numbers[i + 1])){
                longest += " " + numbers[i+1];
            }else {
                count = 0;
                longest = "";
            }

            if (longest.length() > theBestLongest.length()){
                theBestLongest = longest;
            }
        }
        System.out.print(theBestLongest);
    }
}