package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstHand.size() != 0 && secondHand.size() != 0){

            int firstCardFirstHand = firstHand.get(0);
            int firstCardSecondHand = secondHand.get(0);
            firstHand.remove(0);
            secondHand.remove(0);

            if (firstCardFirstHand > firstCardSecondHand){

                firstHand.add(firstCardFirstHand);
                firstHand.add(firstCardSecondHand);

            }else if (firstCardSecondHand > firstCardFirstHand){

                secondHand.add(firstCardSecondHand);
                secondHand.add(firstCardFirstHand);
            }
        }

        if (firstHand.size() == 0){

            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondHand));
        }else if (secondHand.size() == 0){

            System.out.printf("First player wins! Sum: %d", getCardsSum(firstHand));
        }
    }

    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}
