package Fundamentals.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passengers = Integer.parseInt(scanner.nextLine());
        int[] freePlaces = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean enoughPassengers = false;

        for (int i = 0; i < freePlaces.length; i++) {

            for (int j = freePlaces[i]; j < 4; j++) {
                passengers--;
                freePlaces[i]++;
                if (passengers <= 0) {
                    enoughPassengers = true;
                    break;
                }
            }

            if (enoughPassengers) {

                boolean emptyPlace = true;
                for (int place : freePlaces) {
                    if (place >= 4) {
                        emptyPlace = false;
                    } else {
                        emptyPlace = true;
                    }
                }

                if (emptyPlace){
                    System.out.println("The lift has empty spots!");
                    for (int freePlace : freePlaces) {
                        System.out.print(freePlace + " ");
                    }
                }else {
                    for (int freePlace : freePlaces) {
                        System.out.print(freePlace + " ");
                    }
                }
                return;
            }
        }
        System.out.printf("There isn't enough space! %d people in a queue!\n", passengers);
        for (int freePlace : freePlaces) {
            System.out.print(freePlace + " ");
        }
    }
}