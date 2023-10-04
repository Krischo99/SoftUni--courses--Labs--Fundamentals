package Fundamentals.Medium;

import java.util.Scanner;

public class data_Type_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int startingPower = power;
        int countPoke = 0;
        while (power >= distance){

            power -= distance;
            countPoke ++;
            if (power == startingPower/2){
                if (factor > 0){
                    power /= factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoke);
    }
}