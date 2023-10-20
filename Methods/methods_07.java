package Fundamentals.Methods;

import java.util.Scanner;

public class methods_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numPrint = Integer.parseInt(scanner.nextLine());

        System.out.println(printString(input,numPrint));
    }

    public static String printString(String input, int print){

        String finishedInput = "";
        for (int i = 0; i < print; i++) {
            finishedInput += input;
        }
        return finishedInput;
    }
}