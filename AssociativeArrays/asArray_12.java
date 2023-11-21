package Fundamentals.AssociativeArrays;

import java.util.*;

public class asArray_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employee = new LinkedHashMap<>();

        while (true){

            String[] inputs = scanner.nextLine().split(" -> ");
            if (inputs[0].equals("End")){
                break;
            }

            String companyName = inputs[0];
            String id = inputs[1];
            if (!employee.containsKey(companyName)){

                employee.put(companyName, new ArrayList<>());
                employee.get(companyName).add(id);
            }else {

                List<String> currentEmployee = employee.get(companyName);
                if (!currentEmployee.contains(id)){
                    employee.get(companyName).add(id);
                }
            }
        }

        employee.entrySet()
                .forEach(entry -> {
                    System.out.printf("%s\n", entry.getKey());
                    entry.getValue().forEach(employees -> System.out.println("-- "+ employees));
                });
    }
}
