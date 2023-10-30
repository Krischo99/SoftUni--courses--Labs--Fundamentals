package Fundamentals.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> newNum = new ArrayList<>();

        if (numbers.size() % 2 != 0) {
            int midNum = numbers.size() / 2;
            numbers.add(midNum, 0);
        }

        for (int i = 0; i < numbers.size() / 2; i++) {
            newNum.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
        }

        System.out.println(String.join(" ", newNum.stream().map(e -> String.valueOf(e)).toArray(String[]::new)));
    }
}