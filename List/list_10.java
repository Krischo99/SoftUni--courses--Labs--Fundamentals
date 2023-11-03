package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Delete")){

                int element = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(element));

            }else if (command.contains("Insert")){

                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);

                numbers.add(index, element);
            }

            command = scanner.nextLine();
        }

        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}