package Fundamentals.Methods;

import java.util.Scanner;

public class methods_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {

            print(i);
        }

        for (int i = n - 1; i > 0 ; i--) {

            print(i);
        }
    }

    public static void print (int end){

        for (int i = 1; i <= end; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}