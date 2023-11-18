package Fundamentals.AssociativeArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;

public class asArray_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] word = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> e.toLowerCase(Locale.ROOT))
                .toArray(String[]::new);
        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        for (String currentWord: word) {

            if (words.containsKey(currentWord)){

                words.put(currentWord, words.get(currentWord) + 1);
            }else {

                words.put(currentWord, 1);
            }
        }

        String[] result = words.entrySet().stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(e -> e.getKey())
                .toArray(String[]::new);

        System.out.println(String.join(", ", result));
    }
}
