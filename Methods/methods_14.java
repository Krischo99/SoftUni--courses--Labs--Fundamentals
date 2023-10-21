package Fundamentals.Methods;

import java.util.Scanner;

public class methods_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter(String text) {

        //проверка дали дължината на текста е с нечетен брой букви
        if (text.length() % 2 != 0) {
            // текста е с нечен брой букви, значи има 1 средна буква
            System.out.println(text.charAt(text.length() / 2));

        } else {
            //текста е с четен брой букви, значи има 2 средни букви

            char firstLetter = findFirstCharacter(text);
            char secondLetter = findSecondCharacter(text);

            System.out.printf("%c%c", firstLetter, secondLetter);
        }
    }

    public static char findSecondCharacter(String text) {

        return text.charAt(text.length() / 2);
    }

    public static char findFirstCharacter(String text) {

        char firstLetter = '0';

        //алгоритъм за намиране на първата буква
        for (int i = text.length() - 1; i > text.length() / 2; ) {
            i -= text.length() / 2;
            firstLetter = text.charAt(i);
        }
        return firstLetter;
    }
}