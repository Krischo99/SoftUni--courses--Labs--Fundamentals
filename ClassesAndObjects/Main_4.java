package Fundamentals.ClassesAndObjects;

import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberMessage = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberMessage; i++) {
            Message randomMessage = new Message();
            System.out.println(randomMessage.randomMessage());
        }
    }
}
