package Fundamentals.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> number = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minSize = Math.min(numbers.size(), number.size());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {

            result.add(numbers.get(i));
            result.add(number.get(i));
        }

        if (numbers.size() == number.size()) {

            printList(result);
        } else {

            List<Integer> newList = biggerList(numbers, number);
            int bigSizeList = Math.max(numbers.size(), number.size());
            printList(addNewElementsInList(minSize, bigSizeList, newList, result));
        }
    }

    public static List<Integer> addNewElementsInList(int start, int end, List<Integer> num, List<Integer> result) {

        for (int i = start; i < end; i++) {
            result.add(num.get(i));
        }

        return result;
    }

    public static List<Integer> biggerList(List<Integer> numbers, List<Integer> number) {

        if (numbers.size() > number.size()) {

            return numbers;
        } else {

            return number;
        }
    }

    public static void printList(List<Integer> numbers) {

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}