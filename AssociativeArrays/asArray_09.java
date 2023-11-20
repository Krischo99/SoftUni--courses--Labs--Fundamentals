package Fundamentals.AssociativeArrays;

import java.util.*;

public class asArray_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (true){

            String[] command = scanner.nextLine().split(" : ");
            if (command[0].equals("end")){

                break;
            }

            if(courses.containsKey(command[0])){

                 boolean sameName = false;
                for (String name: courses.get(command[0])) {

                    if (command[1].equals(name)){

                        sameName = true;
                    }
                }

                if (!sameName){

                    String student = command[1];
                    courses.get(command[0]).add(student);
                }
            }else {

                courses.put(command[0], new ArrayList<>());
                courses.get(command[0]).add(command[1]);
            }
        }

        courses.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
