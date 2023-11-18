package Fundamentals.AssociativeArrays;

import java.util.*;

public class asArray_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> wordSynonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonyms = scanner.nextLine();

            if (!wordSynonyms.containsKey(word)){

                wordSynonyms.put(word, new ArrayList<>());
            }

            wordSynonyms.get(word).add(synonyms);
        }

        for (Map.Entry<String, List<String>> kvp: wordSynonyms.entrySet()) {

            System.out.printf("%s - %s\n",
                    kvp.getKey(),
                    String.join(", ", kvp.getValue()));
        }
    }
}
