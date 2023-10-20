package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class methods_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(operation(num,operator,num2)));
    }

    public static double operation(int num1, String operation, int num2){

        double result = 0;

        switch (operation){
            case "/":
                result = (double) num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }

        return  result;
    }
}