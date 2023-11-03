package Fundamentals.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class list_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputs = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(inputs);
        System.out.println(inputs.toString().replace("[", "").replace("]", "")
                .replaceAll(",", "").trim().replaceAll("\\s+", " "));
    }
}
