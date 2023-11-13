package Fundamentals.ClassesAndObjects;

import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleInput = scanner.nextLine().split(", ");
        Article article = new Article(articleInput[0], articleInput[1], articleInput[2]);

        int corrections = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < corrections; i++) {

            String[] commandParts = scanner.nextLine().split(": ");
            String command = commandParts[0];

            if (command.equals("Edit")){
                article.edit(commandParts[1]);
            }else if (command.equals("ChangeAuthor")){
                article.changeAuthor(commandParts[1]);
            }else if (command.equals("Rename")){
                article.rename(commandParts[1]);
            }
        }

        System.out.println(article.toString());
    }
}
