package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int bombNum = digits[0];
        int number = digits[1];

        for (int i = 0; i < numbers.size(); i++) {

            int currentNumber = numbers.get(i);
            if (currentNumber == bombNum) {

                modifyList(numbers, number, bombNum);
                i = -1;
            }
        }

        sumElements(numbers);
    }

    public static void modifyList(List<Integer> numbers, int interaction, int bomb) {

        //изваждане на числата от ляво
        int bombIndex = numbers.indexOf(bomb);
        int currentInteraction = 0;
        for (int i = bombIndex; i > 0;) {

            numbers.remove(i - 1);
            i = numbers.indexOf(bomb);
            currentInteraction++;
            if (currentInteraction == interaction) {

                break;
            }
        }

        //изваждане на числата от дясно
        int currentIndexBomb = numbers.indexOf(bomb);
        int currentInteraction2 = 0;
        while (currentIndexBomb < numbers.size() - 1) {

            numbers.remove(currentIndexBomb + 1);
            currentInteraction2++;
            if (currentInteraction2 == interaction){

                break;
            }
        }

        numbers.remove(numbers.indexOf(bomb));
    }

    public static void sumElements(List<Integer> numbers) {

        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}