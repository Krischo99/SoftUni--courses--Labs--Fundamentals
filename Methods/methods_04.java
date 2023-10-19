package Fundamentals.Methods;

import java.util.Scanner;

public class methods_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int bb = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")){
            addFunction(a,bb);
        }else if (command.equals("multiply")){
            multiplyFunc(a,bb);
        }else if (command.equals("subtract")){
            subtractFunc(a,bb);
        }else if (command.equals("divide")){
            divideFunc(a,bb);
        }
    }

    public static void addFunction (int a, int b){
        System.out.println(a + b);
    }

    public static void multiplyFunc (int a, int b){
        System.out.println(a*b);
    }

    public static void subtractFunc (int a, int b){
        System.out.println(a- b);
    }

    public static void divideFunc (int a, int b){
        System.out.println(a/b);
    }
}