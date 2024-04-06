package Fundamentals.MoreSoftUniLabs.Arrays;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++) {

            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                if (i % 2 == 0){
                    System.out.print("#");
                }else {
                    System.out.print("$");
                }

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
