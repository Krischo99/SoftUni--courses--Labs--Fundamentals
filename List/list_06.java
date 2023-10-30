package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine(). split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true){

            String [] inputs = scanner.nextLine().split(" ");

            if (inputs[0].equals("end")){
                break;
            }else if (inputs[0].equals("Add")){

                numbers.add(Integer.valueOf(inputs[1]));
            }else if (inputs[0].equals("Remove")){

                numbers.remove(Integer.valueOf(inputs[1]));
            }else if (inputs[0].equals("RemoveAt")){

                numbers.remove(Integer.parseInt(inputs[1]));
            }else if (inputs[0].equals("Insert")){

                numbers.add(Integer.parseInt(inputs[2]), Integer.valueOf(inputs[1]));
            }

        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
