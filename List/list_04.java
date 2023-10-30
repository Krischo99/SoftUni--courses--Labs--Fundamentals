package Fundamentals.List;

import java.util.*;
import java.util.stream.Collectors;

public class list_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(removeNegativeDigit(numbers));

        if (numbers.size() > 0) {
            printList(numbers);
        } else {
            System.out.print("empty");
        }
    }

    public static void printList(List<Integer> numbers) {

        for (int num : numbers) {
            System.out.printf("%d ", num);
        }
    }

    public static List<Integer> removeNegativeDigit(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);

            if (currentNum < 0) {

                numbers.remove(Integer.valueOf(currentNum));
                i = -1;
            }
        }

        return numbers;
    }
}
