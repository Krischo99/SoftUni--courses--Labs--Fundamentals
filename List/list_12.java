package Fundamentals.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();

            if (name.contains("not")) {

                String currentName = name.split(" ")[0];
                removedPerson(currentName, names);

            } else {

                String addName = name.split(" ")[0];
                checkIsAlreadyThere(addName, names);

            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void removedPerson(String name, List<String> names) {

        boolean removed = false;
        int index = 0;
        for (int i = 0; i < names.size(); i++) {

            if (name.equals(names.get(i))) {

                removed = true;
                index = i;
                break;
            }
        }

        if (removed) {

            names.remove(index);
        } else {

            System.out.printf("%s is not in the list!\n", name);
        }
    }

    public static void checkIsAlreadyThere(String name, List<String> names) {

        boolean isAlreadyInvited = false;
        int index = 0;
        for (int i = 0; i < names.size(); i++) {

            if (name.equals(names.get(i))) {

                isAlreadyInvited = true;
                index = i;
                break;
            }
        }

        if (isAlreadyInvited) {

            System.out.printf("%s is already in the list!\n", name);
        } else {

            names.add(name);
        }
    }
}