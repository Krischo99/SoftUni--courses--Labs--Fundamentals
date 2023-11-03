package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Това е задача 9 от джъдж
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int allRemovedElements = 0;
        while (numbers.size() > 0) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber >= 0 && currentNumber <= numbers.size() - 1) {

                int removedElement = numbers.get(currentNumber);
                allRemovedElements += removedElement;
                numbers.remove(currentNumber);
                modifyList(numbers, removedElement);

            } else if (currentNumber < 0) {

                int removedFirstElement = numbers.get(0);
                allRemovedElements += removedFirstElement;
                numbers.remove(0);
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.add(0, lastElement);
                modifyList(numbers, removedFirstElement);

            } else if (currentNumber > numbers.size() - 1) {

                int removedLastElement = numbers.get(numbers.size()-1);
                allRemovedElements += removedLastElement;
                int firstElement = numbers.get(0);
                numbers.remove(numbers.size()-1);
                numbers.add(firstElement);
                modifyList(numbers, removedLastElement);

            }


        }

        System.out.print(allRemovedElements);
    }

    public static void modifyList(List<Integer> numbers, int removedElement) {

        for (int i = 0; i <= numbers.size() - 1; i++) {

            int currentNum = numbers.get(i);
            if (currentNum <= removedElement) {

                currentNum += removedElement;
            } else {

                currentNum -= removedElement;
            }

            numbers.set(i, currentNum);
        }
    }
}