package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("end")){

            if (inputCommand.contains("swap")){
                int indexFirst = Integer.parseInt(inputCommand.split(" ")[1]);
                int indexSecond = Integer.parseInt(inputCommand.split(" ")[2]);

                int firstNum = numbers[indexFirst];
                numbers[indexFirst] = numbers[indexSecond];
                numbers[indexSecond] = firstNum;

            }else if (inputCommand.contains("multiply")){
                int indexFirst = Integer.parseInt(inputCommand.split(" ")[1]);
                int indexSecond = Integer.parseInt(inputCommand.split(" ")[2]);

                numbers[indexFirst] = numbers[indexFirst] * numbers[indexSecond];

            }else if (inputCommand.contains("decrease")){
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }
            }
            inputCommand = scanner.nextLine();
        }


        for (int i = 0; i < numbers.length - 1; i++) {

        }
    }
}