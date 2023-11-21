package Fundamentals.AssociativeArrays;

public class asArray_14 {

    private String[] fruits = {"Banana", "Apples", "Tomatoes"};

    public asArray_14() { }

    public void addFruits(String fruit) {

        String[] arrayOfFruits = new String[this.fruits.length + 1];
        for (int i = 0; i < this.fruits.length; i++) {

            arrayOfFruits[i] = this.fruits[i];
        }
        arrayOfFruits[this.fruits.length] = fruit;
        this.fruits = arrayOfFruits;
    }

    public void view (){

        for (int i = 0; i < this.fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
