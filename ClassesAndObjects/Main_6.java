package Fundamentals.ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPersons = Integer.parseInt(scanner.nextLine());
        List<Persons> persons = new ArrayList<>();

        for (int i = 0; i < numberOfPersons; i++) {
            String[] personInfo = scanner.nextLine().split(" ");
            int age = Integer.parseInt(personInfo[1]);
            Persons person = new Persons(personInfo[0], age);

            if (person.getAge() > 30){
                persons.add(person);
            }
        }

        for (Persons person: persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
