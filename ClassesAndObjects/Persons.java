package Fundamentals.ClassesAndObjects;

public class Persons {

    private String name;
    private int age;


    public Persons(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public int getAge() {

        return this.age;
    }

    public String getName(){

        return this.name;
    }
}
