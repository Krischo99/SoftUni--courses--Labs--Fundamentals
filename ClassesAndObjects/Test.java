package Fundamentals.ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        while (true) {

            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("End")) {
                break;
            }

            int horsePower = Integer.parseInt(command[3]);
            Vehicle vehicle = new Vehicle(command[0], command[1], command[2], horsePower);

            vehicles.add(vehicle);
        }

        while (true) {

            String models = scanner.nextLine();

            if (models.equals("Close the Catalogue")) {
                break;
            }

            printModel(models, vehicles);
        }

        averageHorsePower(vehicles);
    }

    public static void printModel(String model, List<Vehicle> vehicles) {

        for (Vehicle vehicle : vehicles) {

            if (model.equals(vehicle.getModelOfVehicle())) {
                System.out.print(vehicle.toString());
            }
        }
    }

    public static void averageHorsePower(List<Vehicle> vehicles) {

        double truckAverage = 0;
        double carAverage = 0;

        int countTrucks = 0;
        int countCars = 0;
        for (Vehicle vehicle : vehicles) {

            if (vehicle.getTypeOfVehicle().equals("truck")) {

                truckAverage += vehicle.getHorsepowerOfVehicle();
                countTrucks++;
            } else {

                carAverage += vehicle.getHorsepowerOfVehicle();
                countCars++;
            }
        }

        if (countCars == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        }else {
            System.out.printf("Cars have average horsepower of: %.2f.\n", carAverage / countCars);
        }

        if (countTrucks == 0){
            System.out.println("Trucks have average horsepower of: 0.00.");
        }else {
            System.out.printf("Trucks have average horsepower of: %.2f.\n", truckAverage / countTrucks);
        }
    }
}
