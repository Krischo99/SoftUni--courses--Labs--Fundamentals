package Fundamentals.ClassesAndObjects;

import java.util.*;

public class Main_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        while (true) {

            String[] inputsInfo = scanner.nextLine().split(" ");

            if (inputsInfo[0].equals("End")) {
                break;
            }

            Person currentPerson = new Person(inputsInfo[0], inputsInfo[1], Integer.parseInt(inputsInfo[2]));
            persons.add(currentPerson);
        }

        Collections.sort(persons, Comparator.comparingInt(Person::getAge));

        for (Person person : persons) {
            System.out.println(person.printPersonInfo());
        }
    }
}
