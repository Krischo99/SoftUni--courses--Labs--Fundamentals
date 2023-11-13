package Fundamentals.ClassesAndObjects;

public class Students {

    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Students(String firstName, String lastName, int age, String homeTown) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getHomeTown() {

        return homeTown;
    }

    public void setHomeTown(String town) {

        this.homeTown = town;
    }

    public String getStudentInfo() {

        return String.format("%s %s is %d years old",
                this.firstName,
                this.lastName,
                this.age);
    }
}
