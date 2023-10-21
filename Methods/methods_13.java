package Fundamentals.Methods;

import java.util.Scanner;

public class methods_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();

        System.out.println(numOfVowelsLetters(word));
    }

    public static int numOfVowelsLetters (String word){

        int numVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            switch (letter){
                case 'e':
                case 'u':
                case 'i':
                case 'o':
                case 'a':
                    numVowels ++;
                    break;
            }
        }

        return numVowels;
    }
}