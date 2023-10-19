package Fundamentals.Methods;

import java.util.Scanner;

public class methods_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());

        System.out.println(calculationArea(sideA,sideB));
    }

    public static int calculationArea(int a, int b){
        return a*b;
    }
}
