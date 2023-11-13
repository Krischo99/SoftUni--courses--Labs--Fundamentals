package Fundamentals.ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {

        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet){

        if (this.data.size() < this.capacity){
            this.data.add(pet);
        }
    }

    public boolean remove(String name){

        for (Pet pet: this.data) {

            if (name.equals(pet.getName())){
                this.data.remove(pet);
                return true;
            }
        }

        return false;
    }

    public Pet getPet(String name, String owner){

        for (Pet pet: this.data) {

            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){

                return pet;
            }
        }

        return null;
    }

    public int getCount(){

        return this.data.size();
    }

    public String getStatistics(){

        String output = "";

        output += "The grooming salon has the following clients:\n";

        for (Pet pet : this.data) {
            output += pet.getName() + " " + pet.getOwner() + "\n";
        }

        return output;
    }
}
