package Fundamentals.Medium;

import java.util.Scanner;

public class data_Types_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        //МЕТОД С КОЙТО ПРОВЕРЯВАМЕ ДАЛИ БУКВИТЕ СА ГЛАВНИ ИЛИ МАЛКИ
        if (Character.isUpperCase(letter)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}