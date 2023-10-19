package Fundamentals.Methods;

import java.util.Scanner;

public class methods_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numOfProduct = Integer.parseInt(scanner.nextLine());

        endPrice(priceProduct(input),numOfProduct);
    }

    public static double priceProduct(String product) {
        if (product.equals("coffee")) {
            System.out.println("Product is "+ product);
            return 1.50;
        } else if (product.equals("water")) {
            System.out.println("Product is "+ product);
            return 1.00;
        } else if (product.equals("coke")) {
            System.out.println("Product is "+ product);
            return 1.40;
        } else if (product.equals("snacks")) {
            System.out.println("Product is "+ product);
            return 2.00;
        }
        return 0;
    }

    public static void endPrice(double productPrice, int numOfProduct) {
        System.out.printf("%.2f ", productPrice * numOfProduct);
    }
}