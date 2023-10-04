package Fundamentals.Medium;

import java.util.Scanner;

public class data_Type_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start =Integer.parseInt(scanner.nextLine());
        int dayCounter = 0;
        int consum = 0;

        while (start >= 100){

            int perDay = start - 26;
            consum += perDay;
            start -= 10;
            dayCounter ++;
        }
        consum -= 26;

        if (consum < 0){
            consum = 0;
        }

        System.out.println(dayCounter);
        System.out.println(consum);
    }
}