package Fundamentals.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class methods_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] allItems = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).
                toArray();
        int arraySplitter = Integer.parseInt(scanner.nextLine());
        int entryPoint = allItems[arraySplitter];
        String type = scanner.nextLine();


        if (type.equals("cheap")) {

            boolean leftSameNum = sameNum(leftArray(arraySplitter, allItems), entryPoint);
            boolean smallNumLeft = checkForSmallNumbers(leftArray(arraySplitter, allItems), entryPoint);
            boolean rightSameNum = sameNum(rightArray(arraySplitter, allItems), entryPoint);
            boolean smallNumRight = checkForSmallNumbers(rightArray(arraySplitter, allItems), entryPoint);

            int smallLeft = 0;
            if (leftSameNum) {
                if (smallNumLeft) {
                    smallLeft = cheapestArraySum(leftArray(arraySplitter, allItems), entryPoint);
                } else {
                    smallLeft = cheapestArraySumWithEntry(leftArray(arraySplitter, allItems), entryPoint);
                }
            } else {
                smallLeft = cheapestArraySum(leftArray(arraySplitter, allItems), entryPoint);
            }

            int smallRight = 0;
            if (rightSameNum) {
                if (smallNumRight) {
                    smallRight = cheapestArraySum(rightArray(arraySplitter, allItems), entryPoint);
                } else {
                    smallRight = cheapestArraySumWithEntry(rightArray(arraySplitter, allItems), entryPoint);
                }
            } else {
                smallRight = cheapestArraySum(rightArray(arraySplitter, allItems), entryPoint);
            }

            if (smallLeft <= smallRight) {
                System.out.printf("Left - %d\n", smallLeft);
            }else {
                System.out.printf("Right - %d\n", smallRight);
            }

        } else if (type.equals("expensive")) {
            int expensiveArrayLeftSum = expensiveArraysSum(leftArray(arraySplitter, allItems), entryPoint);
            int expensiveArrayRightSum = expensiveArraysSum(rightArray(arraySplitter, allItems), entryPoint);

            if (expensiveArrayLeftSum >= expensiveArrayRightSum) {
                System.out.printf("Left - %d", expensiveArrayLeftSum);
            } else {
                System.out.printf("Right - %d", expensiveArrayRightSum);
            }
        }
    }

    public static boolean sameNum(int[] arr, int entry) {

        boolean foundSameNum = false;
        for (int j : arr) {
            if (j == entry) {
                foundSameNum = true;
            }
        }

        return foundSameNum;
    }

    public static int expensiveArraysSum(int[] arr, int entryPoint) {

        int sum = 0;
        for (int j : arr) {
            if (j >= entryPoint) {
                sum = sum + j;
            }
        }

        return sum;
    }

    public static boolean checkForSmallNumbers(int[] arr, int entryPoint) {

        boolean smallThanEntry = false;
        for (int j : arr) {
            if (j < entryPoint) {
                smallThanEntry = true;
            }
        }

        return smallThanEntry;
    }

    public static int cheapestArraySum(int[] arr, int entryPoint) {

        int sum = 0;
        for (int j : arr) {
            if (j < entryPoint) {
                sum += j;
            }
        }

        return sum;
    }

    public static int cheapestArraySumWithEntry(int[] arr, int entryPoint) {

        int sum = 0;
        for (int j : arr) {
            if (j <= entryPoint) {
                sum += j;
            }
        }

        return sum;
    }

    public static int[] leftArray(int n1, int[] allItems) {

        int[] leftItems = new int[n1];
        for (int i = 0; i < n1; i++) {
            leftItems[i] = allItems[i];
        }

        return leftItems;
    }

    public static int[] rightArray(int n1, int[] allItems) {

        int[] rightArray = new int[(allItems.length - 1) - n1];
        int currentNumCels = 0;
        for (int i = n1 + 1; i < allItems.length; i++) {
            rightArray[currentNumCels] = allItems[i];
            currentNumCels++;
        }

        return rightArray;
    }
}