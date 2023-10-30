package Fundamentals.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        printList(number(numbers));
    }

    public static void printList(List<Integer> num) {

        for (int number : num) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> number(List<Integer> num) {

        List<Integer> newNum = new ArrayList<>();
        for (int i = 0; i < num.size() / 2; i++) {

            newNum.add(num.get(i) + num.get(num.size() - 1 - i));
        }

        if ((num.size() % 2 != 0) && num.size() > 1) {
            newNum.add(num.get(num.size() / 2));
        }

        if (num.size() == 1) {
            newNum.add(num.get(0));

            return newNum;
        }

        return newNum;
    }
}