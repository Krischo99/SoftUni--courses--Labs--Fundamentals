package Fundamentals.ClassesAndObjects;

import java.math.BigInteger;
import java.util.Scanner;

public class object_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger sum = new BigInteger(String.valueOf(Integer.valueOf(1)));

        for (int i = 1; i <= number; i++) {
            int currentNumber = i;
            sum = sum.multiply(BigInteger.valueOf(currentNumber));
        }

        System.out.println(sum);
    }
}
