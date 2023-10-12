package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача за намиране на най- дълга поредица от еднакви числа в масив

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxEquals = 0;
        int startIndex = 0;
        int firstStartIndex = 0;

        // преверява се винаги второто число с първото
        for (int i = 1; i <= numbers.length-1; i++) {

            //ако са еднакви дължината на еднаквите числа се увеличава
            if (numbers[i] == numbers[i - 1]){
                length++;
            }else {
                // ако не са еднакви всичко се ресетва
                length = 1;
                // индекса от който ще започва да проверява става равен на втория
                // ако има съвпадение на числата това ще се пропусне
                startIndex = i;
            }

            // намира се най- големия брой еднакви числа и се запазва заедно с идекса от който започват
            if (length > maxEquals){
                maxEquals = length;
                firstStartIndex = startIndex;
            }
        }

        for (int i = firstStartIndex; i < firstStartIndex + maxEquals; i++) {
            System.out.print(numbers[firstStartIndex] + " ");
        }
    }
}