package Fundamentals.Medium;

import java.util.Scanner;

public class data_Type_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double biggestKeg = Double.MIN_VALUE;
        String nameBiggestKeg = "";

        for (int i = 0; i < n; i++) {

            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double sum = Math.PI * Math.pow(radius, 2) * height;

            if (sum > biggestKeg){
                biggestKeg = sum;
                nameBiggestKeg = kegModel;
            }
        }
        System.out.println(nameBiggestKeg);
    }
}