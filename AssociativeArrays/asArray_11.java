package Fundamentals.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class asArray_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> students = new LinkedHashMap();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while (true) {

            String[] labs = scanner.nextLine().split("-");

            String username = labs[0];
            if (username.equals("exam finished")) {

                break;
            }

            String language = labs[1];
            if (language.equals("banned")) {

                students.remove(username);
                continue;
            }

            int points = Integer.parseInt(labs[2]);
            if (students.containsKey(username)) {

                if (points > students.get(username)) {

                    students.put(username, points);
                }
            } else {

                students.put(username, points);
            }
            //Peter-Java-84 , Gosho-Java-84, Peter-C-84
            if (submissions.containsKey(language)) {

                submissions.put(language, submissions.get(language) + 1);
            } else {

                submissions.put(language, 1);
            }
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> kvp : students.entrySet()) {

            System.out.printf("%s | %d\n", kvp.getKey(), kvp.getValue());
        }

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> kvp : submissions.entrySet()) {

            System.out.printf("%s - %d\n", kvp.getKey(), kvp.getValue());
        }
    }
}
