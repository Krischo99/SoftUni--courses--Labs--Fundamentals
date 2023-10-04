package Fundamentals.Medium;

import java.util.Scanner;

public class data_Type_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // АЛГОРИТЪМ ЗА ВЗЕМАНЕ НА ПОСЛЕДНИТЕ ЧИСЛА И ПРЕМАХВАНЕТО ИМ ОТ ПРОМЕНЛИВА
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number > 0){
            // КОГАТО ВЗЕМЕШ ЕДНО ЧИСЛО И ПРОЦЕНТНО ГО РАЗДЕЛИШ НА 10, ПОЛУЧАВАШ ВИНАГИ ПОСЛЕДНАТА МУ ЦИФРА
            int lastNum = number % 10;
            sum += lastNum;
            //КОГАТО ЧИСЛОТО СЕ РАЗДЕЛИ ЦЕЛОЧИСЛЕНО НА 10 СЕ ПРЕМАХВА ПОСЛЕДНАТА ЦИФРА
            number /= 10;
            System.out.println(number);
        }
        System.out.println(sum);
    }
}