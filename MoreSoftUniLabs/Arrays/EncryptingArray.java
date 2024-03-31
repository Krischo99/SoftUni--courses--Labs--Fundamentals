package Fundamentals.MoreSoftUniLabs.Arrays;

import java.util.Scanner;

public class EncryptingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int lines = Integer.parseInt(scanner.nextLine());
        // Create an array to store the sums of characters
        int[] allSequence = new int[lines];

        // Iterate through each line
        for (int i = 0; i < lines; i++) {
            // Read the line
            String name = scanner.nextLine();
            // Calculate the sum of characters for the current line
            int nameSum = Sum(name);

            // Store the sum in the array
            allSequence[i] = nameSum;
        }

        // Sort the array
        Sort(allSequence);

        // Print the sorted array
        for (int i = 0; i < allSequence.length; i++) {
            System.out.println(allSequence[i]);
        }
    }

    // Method to sort the array
    private static void Sort(int[] allSequence) {

        for (int i = 0; i < allSequence.length - 1; i++) {
            // Bubble sort algorithm
            if (allSequence[i] > allSequence[i + 1]) {
                int bigger = allSequence[i];
                allSequence[i] = allSequence[i + 1];
                allSequence[i + 1] = bigger;
                // Reset the loop to start again from the beginning
                i = -1;
            }
        }
    }

    // Method to calculate the sum of characters in a string
    private static int Sum(String name) {

        int charSum = 0;
        // Iterate through each character in the string
        for (int i = 0; i < name.length(); i++) {
            // Calculate the sum of the character based on its value
            charSum += SumOfChar(name.charAt(i), name);
        }

        return charSum;
    }

    // Method to calculate the sum of a character based on its value
    private static int SumOfChar(char letter, String name) {

        int letterN = letter;
        // Check if the character is a vowel
        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                // Return the sum of the character multiplied by the length of the string
                return letterN * name.length();
            default:

                // Return the sum of the character divided by the length of the string
                return letterN / name.length();
        }
    }
}