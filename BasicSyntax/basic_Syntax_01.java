package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String text = "";
        String text2 = "";

        boolean foundC = false;
        boolean foundO = false;
        boolean foundN = false;

        int countO = 0;
        int countC = 0;
        int countN = 0;

        while (!input.equals("End")) {
            char letter = input.charAt(0);

            if (Character.isLetter(letter)) {
                if (letter == 'o' && countO < 1) {
                    foundO = true;
                    countO ++;
                } else if (letter == 'c' && countC < 1) {
                    foundC = true;
                    countC ++;
                } else if (letter == 'n' && countN < 1) {
                    foundN = true;
                    countN ++;
                }else {
                    text2 += letter;
                }
            } else {
                input = scanner.nextLine();
                continue;
            }

            if (foundC && foundN && foundO){
                text2 += " ";
                foundC = false;
                foundN = false;
                foundO = false;
                countO = 0;
                countC = 0;
                countN = 0;
                text = text2;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%s",text);
    }
}
