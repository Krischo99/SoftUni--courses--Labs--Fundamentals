package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0;

        while (!input.equals("Start")) {
            double convertToMoney = Double.parseDouble(input);
            if (convertToMoney != 0.1 && convertToMoney != 0.2 && convertToMoney != 0.5 && convertToMoney != 1 && convertToMoney != 2) {
                System.out.printf("Cannot accept %.2f\n", convertToMoney);
                input = scanner.nextLine();
                continue;
            }

            money += convertToMoney;
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            double price = 0;
            if ("Nuts".equals(input)) {
                price = 2;
            } else if ("Water".equals(input)) {
                price = 0.7;
            } else if ("Crisps".equals(input)) {
                price = 1.5;
            } else if ("Soda".equals(input)) {
                price = 0.8;
            } else if ("Coke".equals(input)) {
                price = 1;
            } else {
                System.out.println("Invalid product");
                input = scanner.nextLine();
                continue;
            }

            if (money - price >= 0) {
                money -= price;
                System.out.printf("Purchased %s\n", input);
                if (money == 0) {
                    break;
                }
            } else {
                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}