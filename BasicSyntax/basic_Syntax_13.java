package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : words) {
            String replaceWord = generetedWord(word);
            text = text.replace(word, replaceWord);
        }

        System.out.println(text);
    }

    public static String generetedWord(String word){

        int lenght = word.length();
        word = "";
        for (int i = 0; i < lenght; i++) {
            word += "*";
        }

        return word;
    }

    public static String generatedWord(String word){

        int lenght = word.length();
        word = "*".repeat(lenght);

        return word;
    }
}
