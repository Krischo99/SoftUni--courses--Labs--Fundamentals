package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(word)){

            int index = text.indexOf(word);
            String leftString = text.substring(0, index);
            String rightString = text.substring(index + word.length());
            text = leftString + rightString;
        }

        System.out.println(text);
    }
}