package Fundamentals.AssociativeArrays;

import java.util.*;

public class asArray_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentBase = new LinkedHashMap<>();

        int countStud = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countStud; i++) {
            String nameStudent = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentBase.putIfAbsent(nameStudent, new ArrayList<>());
            studentBase.get(nameStudent).add(grade);
        }

        for (Map.Entry<String, List<Double>> kvp: studentBase.entrySet()) {
            averageGrade(studentBase.get(kvp.getKey()));
            if (kvp.getValue().get(0) >= 4.50){
                System.out.printf("%s -> %.2f\n", kvp.getKey(), kvp.getValue().get(0));
            }
        }
    }

    public static void averageGrade(List<Double> grades){

        double sum = 0.0;
        int size = grades.size();
        for (int i = 0; i < grades.size(); i++) {

            sum += grades.get(i);
            grades.remove(i);
            i = -1;
        }

        grades.add(sum/size);
    }
}
