package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            if (input.contains("Add")) {

                int number = Integer.parseInt(input.split(" ")[1]);
                numbers.add(number);

            } else if (input.contains("Insert")) {

                int index = Integer.parseInt(input.split(" ")[2]);

                if (index >= 0 && index <= numbers.size() - 1) {

                    int number = Integer.parseInt(input.split(" ")[1]);
                    numbers.add(index, number);

                } else {

                    System.out.println("Invalid index");
                }

            } else if (input.contains("Remove")) {

                int index = Integer.parseInt(input.split(" ")[1]);

                if (index >= 0 && index <= numbers.size() - 1){

                    numbers.remove(index);
                }else {

                    System.out.println("Invalid index");
                }

            } else if (input.contains("Shift") && input.contains("left")) {

                int count = Integer.parseInt(input.split(" ")[2]);
                String leftSide = input.split(" ")[1];
                modifyList(count, leftSide, numbers);

            } else if (input.contains("Shift") && input.contains("right")) {

                int count = Integer.parseInt(input.split(" ")[2]);
                String rightSide = input.split(" ")[1];
                modifyList(count, rightSide, numbers);

            }

            input = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
    }

    public static void modifyList(int count, String side, List<Integer> numbers) {

        if (side.equals("left")) {

            for (int i = 0; i < count; i++) {

                int firstElement = numbers.get(0);
                numbers.remove(0);
                numbers.add(firstElement);

            }
        } else {

            for (int i = 0; i < count; i++) {

                int lastElement = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(0, lastElement);
            }
        }
    }
}