package Fundamentals.BasicSyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic_Syntax_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removedWord = scanner.nextLine();
        String word = scanner.nextLine();
        List<Character> wordWord = new ArrayList<>();
        convertStringToChar(wordWord, word);

        while (word.contains(removedWord)) {

            int startMach = word.indexOf(removedWord);
            int endMach = removedWord.length();

            for (int i = 0; i < word.length(); i++) {

                if (i == startMach) {
                    for (int j = 0; j < endMach; j++) {

                        wordWord.remove(startMach);
                    }
                    break;
                }
            }

            word = convertCharToString(wordWord);
        }

        System.out.println(word);
    }

    public static void convertStringToChar(List<Character> lettersWord, String word) {

        for (int i = 0; i < word.length(); i++) {

            lettersWord.add(word.charAt(i));
        }
    }

    public static String convertCharToString(List<Character> wordLetter) {

        String word = "";
        for (char letter: wordLetter) {
            word += String.valueOf(letter);
        }

        return word;
    }
}
