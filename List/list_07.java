package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {

            String[] inputs = scanner.nextLine().split(" ");

            while (inputs.length == 0 ) {

                inputs = scanner.nextLine().split(" ");
            }

            if (inputs[0].equals("end")) {

                break;

            } else if (inputs[0].equals("Contains")) {

                int num = Integer.parseInt(inputs[1]);
                containsNumber(num, numbers);

            } else if (inputs[0].equals("Print")) {

                String evenOrOdd = inputs[1];
                printEvenOrOdd(evenOrOdd, numbers);

            } else if (inputs[0].equals("Get") && inputs[1].equals("sum")) {

                System.out.println(printListDigitSum(numbers));

            } else if (inputs[0].equals("Filter")) {

                String filter = inputs[1];
                int number = Integer.parseInt(inputs[2]);
                printChosenFilterDigits(filter, number, numbers);

            }
        }
    }

    public static void containsNumber(int number, List<Integer> numbers) {

        boolean foundContainedNum = false;
        for (Integer integer : numbers) {
            if (number == integer) {
                foundContainedNum = true;
                break;
            }
        }

        if (foundContainedNum) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenOrOdd(String command, List<Integer> numbers) { // CHETNI ILI NECHETNI

        if (command.equals("even")) {

            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    System.out.printf("%d ", number);
                }
            }

        } else if (command.equals("odd")) {

            for (Integer number : numbers) {
                if (number % 2 != 0) {
                    System.out.printf("%d ", number);
                }
            }

        }

        System.out.println();
    }

    public static int printListDigitSum(List<Integer> numbers) {

        int sumOfDigits = 0;
        for (Integer number : numbers) {
            sumOfDigits += number;
        }

        return sumOfDigits;
    }

    public static void printChosenFilterDigits(String filter, int number, List<Integer> numbers) {

        if (filter.equals("<")) {

            for (Integer integer : numbers) {
                if (integer < number) {
                    System.out.printf("%d ", integer);
                }
            }

        } else if (filter.equals(">")) {

            for (Integer integer : numbers) {
                if (integer > number) {
                    System.out.printf("%d ", integer);
                }
            }

        } else if (filter.equals("<=")) {

            for (Integer integer : numbers) {
                if (integer <= number) {
                    System.out.printf("%d ", integer);
                }
            }

        } else if (filter.equals(">=")) {

            for (Integer integer : numbers) {
                if (integer >= number) {
                    System.out.printf("%d ", integer);
                }
            }

        }

        System.out.println();
    }
}