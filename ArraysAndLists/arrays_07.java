package Fundamentals.ArraysAndLists;

import java.util.Scanner;

public class arrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            String[] num = scanner.nextLine().split(" ");

            while (num.length < 2){
                num = scanner.nextLine().split(" ");
            }

            if (i % 2 == 0){
                firstArray[i] = Integer.parseInt(num[0]);
                secondArray[i] = Integer.parseInt(num[1]);
            }else {
                secondArray[i] = Integer.parseInt(num[0]);
                firstArray[i] = Integer.parseInt(num[1]);
            }
        }

        for (int num: firstArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num2:secondArray) {
            System.out.print(num2 + " ");
        }
    }
}