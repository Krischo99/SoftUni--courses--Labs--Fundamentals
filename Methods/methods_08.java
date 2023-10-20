package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class methods_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number = Double.parseDouble(scanner.nextLine());
        double powNumber = Double.parseDouble(scanner.nextLine());
        
        System.out.println(new DecimalFormat("0.####").format(powFunction(number,powNumber)));
    }
    
    public static double powFunction(double num, double pow){
        double result = 1;

        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }
}