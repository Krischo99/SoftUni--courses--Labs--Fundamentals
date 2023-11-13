package Fundamentals.ClassesAndObjects;

public class Vehicle {

    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;

    public Vehicle(String type, String model, String color, int horsepower) {

        this.typeOfVehicle = type;
        this.modelOfVehicle = model;
        this.colorOfVehicle = color;
        this.horsepowerOfVehicle = horsepower;
    }

    public String getTypeOfVehicle() {

        return typeOfVehicle;
    }

    public String getModelOfVehicle() {

        return modelOfVehicle;
    }

    public int getHorsepowerOfVehicle() {

        return horsepowerOfVehicle;
    }

    @Override
    public String toString(){

        String typeVeh = typeOfVehicle.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh + "\n" +
                "Model: " +  modelOfVehicle + "\n" +
                "Color: " + colorOfVehicle + "\n" +
                "Horsepower: " + horsepowerOfVehicle + "\n";
    }
}