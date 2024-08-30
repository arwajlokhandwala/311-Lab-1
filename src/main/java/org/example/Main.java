package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //int numberOfWheels, String color, float engineSize, String fuelType
        Vehicle v1 = new Vehicle(4,"White", 1, "Petrol" );
        System.out.println("Vehicle Class - Testing parameterized constructor: \n" +
                "Number of Wheels: " + v1.getNumberOfWheels() + "\nColor: " + v1.getColor() +
                "\nEngine Size: " + v1.getEngineSize() + "\nFuel Type: " + v1.getFuelType());

        Vehicle v2 = new Vehicle();
        v2.setNumberOfWheels(4);
        v2.setColor("Blue");
        v2.setEngineSize(3);
        v2.setFuelType("Gasoline");

        System.out.println("\nVehicle Class - Testing set/get methods: \n" +
                "Number of Wheels: " + v2.getNumberOfWheels() + "\nColor: " + v2.getColor() +
                "\nEngine Size: " + v2.getEngineSize() + "\nFuel Type: " + v2.getFuelType());

         Car acura = new Car(4,"Yellow", 2, "Propane","Acura");
         System.out.println("\nTesting Car parameterized constructor & displayInfo() method:\n" + acura.displayInfo());

         System.out.println("\nTesting honk() method:" );
         acura.honk();




    }
}