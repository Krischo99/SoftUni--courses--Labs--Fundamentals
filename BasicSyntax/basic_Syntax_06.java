package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startLetter = scanner.nextLine();
        String lastLetter = scanner.nextLine();
        String withoutLetter = scanner.nextLine();

        int letterNumStart = 0;
        int letterNumLast = 0;
        int combination = 0;

        String allLetters = "abcdefghijklmnopqrstuvwxyz";

        for (int l = 0; l < allLetters.length(); l++) {
            char oneLetter = allLetters.charAt(l);
            String letter = String.valueOf(oneLetter);
            if (startLetter.equals(letter)) {
                letterNumStart = l;
            }
            if (lastLetter.equals(letter)) {
                letterNumLast = l;
            }
        }

        for (int i = letterNumStart; i <= letterNumLast; i++) {
            char firstLetter = allLetters.charAt(i);
            for (int j = letterNumStart; j <= letterNumLast; j++) {
                char secondLetter = allLetters.charAt(j);
                for (int k = letterNumStart; k <= letterNumLast; k++) {
                    char thirdLetter = allLetters.charAt(k);

                    String first = String.valueOf(firstLetter);
                    String second = String.valueOf(secondLetter);
                    String third = String.valueOf(thirdLetter);

                    if (first.equals(withoutLetter) || second.equals(withoutLetter) || third.equals(withoutLetter)) {
                        continue;
                    } else {
                        System.out.printf("%s%s%s ", first, second, third);
                        combination++;
                    }
                }
            }
        }
        System.out.print(combination);
    }
}
