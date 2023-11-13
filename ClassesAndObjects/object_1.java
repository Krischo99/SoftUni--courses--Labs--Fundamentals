package Fundamentals.ClassesAndObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class object_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesLec = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int interactions = namesLec.size();

        Random random = new Random();

        for (int i = 0; i < interactions; i++) {

            int index = random.nextInt(namesLec.size());
            System.out.println(namesLec.get(index));
            namesLec.remove(index);

        }
    }
}
