package Fundamentals.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class asArray_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] words = scanner.nextLine().split(" ");
        Map<Character, Integer> countLetter = new LinkedHashMap<>();

        for (String word: words) {
           
            countLetters(word, countLetter);
        }

        for (Map.Entry<Character, Integer> kvp: countLetter.entrySet()) {

            System.out.printf("%s -> %d\n", kvp.getKey(), kvp.getValue());
        }
    }
    
    public static void countLetters (String word, Map<Character, Integer> countLetter){

        char[] currentWord = word.toCharArray();
        for (char letter: currentWord) {

            if (countLetter.containsKey(letter)){

                countLetter.put(letter, countLetter.get(letter) + 1);
            }else {

                countLetter.put(letter, 1);
            }
        }
    }
}
