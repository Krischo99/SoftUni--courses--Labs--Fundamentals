package Fundamentals.AssociativeArrays;

import java.util.*;

public class asArray_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isWin = false;

        while (!isWin) {

            String[] inputs = scanner.nextLine().split(" ");
            for (int i = 0; i < inputs.length; i += 2) {

                String item = inputs[i + 1].toLowerCase(Locale.ROOT);
                int numberOfItem = Integer.parseInt(inputs[i]);

                if ("shards".equals(item) || "fragments".equals(item) || "motes".equals(item)) {

                    keyMaterials.put(item, keyMaterials.get(item) + numberOfItem);
                } else {

                    if (junk.containsKey(item)) {
                        junk.put(item, junk.get(item) + numberOfItem);
                    } else {
                        junk.put(item, numberOfItem);
                    }
                }

                if (keyMaterials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    keyMaterials.put("shards", keyMaterials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (keyMaterials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (keyMaterials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    keyMaterials.put("motes", keyMaterials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
        }

        keyMaterials.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junk.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}