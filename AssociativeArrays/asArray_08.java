package Fundamentals.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class asArray_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numReg = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < numReg; i++) {

            String[] commands = scanner.nextLine().split(" ");

            String register = commands[0];
            String username = commands[1];

            if (register.equals("register")) {

                String carNumber = commands[2];
                if (parking.containsKey(username)) {

                    System.out.printf("ERROR: already registered with plate number %s\n", parking.get(username));
                } else {

                    parking.put(username, carNumber);
                    System.out.printf("%s registered %s successfully\n", username, carNumber);
                }
            } else if (register.equals("unregister")) {

                if (parking.containsKey(username)) {

                    parking.remove(username);
                    System.out.printf("%s unregistered successfully\n", username);
                } else {

                    System.out.printf("ERROR: user %s not found\n", username);
                }
            }
        }

        parking.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
