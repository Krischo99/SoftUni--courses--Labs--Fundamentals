package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("Add") && checkForDigits(command)){

                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(number);

            }else {

                int number = Integer.parseInt(command);
                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) + number <= maxPassengers){
                        numbers.set(i, numbers.get(i) + number);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }

    public static boolean checkForDigits (String command){

        String [] inputs = command.split(" ");
        boolean digits = true;

        if (inputs.length > 1){

            String digit = inputs[1];
            for (int i = 0; i < digit.length() ; i++) {
                char currentDigit = digit.charAt(i);

                if (!Character.isDigit(currentDigit)){
                    digits = false;
                    break;
                }
            }
        }else {
            digits = false;
        }

        return digits;
    }
}
