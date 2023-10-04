package Fundamentals.Medium;

import java.util.Scanner;

public class data_Type_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        int biggestSnowBall = Integer.MIN_VALUE;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        for (int i = 0; i < n; i++) {

            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            short snowballQuality = Short.parseShort(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / (double) snowballTime), snowballQuality);

            if (snowballValue > biggestSnowBall){
                biggestSnowBall = (int) snowballValue;
                num1 = snowballSnow;
                num2 = snowballTime;
                num3 = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)\n", num1, num2, biggestSnowBall,num3);
    }
}