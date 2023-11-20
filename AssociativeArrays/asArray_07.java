package Fundamentals.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class asArray_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        while (true) {

            String[] discription = scanner.nextLine().split(" ");
            String productName = discription[0];
            if (productName.equals("buy")) {

                break;
            }
            double price = Double.parseDouble(discription[1]);
            int quantity = Integer.parseInt(discription[2]);


            if (productsQuantity.containsKey(productName)) {

                productsQuantity.put(productName, productsQuantity.get(productName) + quantity);
            } else {

                productsQuantity.put(productName, quantity);
            }

            productsPrice.put(productName, price);
        }

        for (Map.Entry<String, Double> kvp: productsPrice.entrySet()) {

            System.out.printf("%s -> %.2f\n", kvp.getKey(), productsQuantity.get(kvp.getKey()) * kvp.getValue());
        }
    }
}
