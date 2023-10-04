package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class basic_Syntax_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double spend = 0.00;
        while (!input.equals("Game Time")) {
            double sum = 0.00;

            if ("OutFall 4".equals(input) || "RoverWatch Origins Edition".equals(input)) {
                sum = 39.99;
            } else if ("CS: OG".equals(input)) {
                sum = 15.99;
            } else if ("Zplinter Zell".equals(input)) {
                sum = 19.99;
            } else if ("Honored 2".equals(input)) {
                sum = 59.99;
            } else if ("RoverWatch".equals(input)) {
                sum = 29.99;
            } else {
                System.out.println("Not Found");
                input = scanner.nextLine();
                continue;
            }
            if (budget - sum >= 0){
                budget -= sum;
                spend += sum;
                if (budget == 0){
                    System.out.printf("Bought %s\n", input);
                    System.out.println("Out of money!");
                    return;
                }
            }else {
                System.out.println("Too Expensive");
                input = scanner.nextLine();
                continue;
            }

            System.out.printf("Bought %s\n", input);
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, budget);
    }
}