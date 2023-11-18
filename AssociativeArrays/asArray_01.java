package Fundamentals.AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class asArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Double, Integer> numbersCount = new TreeMap<>();

        double [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double number: numbers) {

            if (numbersCount.containsKey(number)){
                numbersCount.put(number, numbersCount.get(number) + 1);
            }else {
                numbersCount.put(number, 1);
            }
        }

        for (Map.Entry<Double, Integer> kvp: numbersCount.entrySet()) {

            String value = new DecimalFormat("#.####").format(kvp.getKey());
            System.out.printf("%s -> %d\n", value, kvp.getValue());
        }
    }
}
